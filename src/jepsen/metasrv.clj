(ns jepsen.metasrv
  (:require [clojure.tools.logging :refer :all]
            [clojure.string :as str]
            [knossos.model :as model]
            [slingshot.slingshot :refer [try+]]
            [jepsen [cli :as cli]
                    [checker :as checker]
                    [client :as client]
                    [control :as c]
                    [db :as db]
                    [generator :as gen]
                    [independent :as independent]
                    [nemesis :as nemesis]
                    [tests :as tests]]
            [jepsen.control.util :as cu]
            [jepsen.checker.timeline :as timeline]
            [jepsen.os.ubuntu :as ubuntu]
            [jepsen.os.debian :as debian]
            )
  (:import (knossos.model Model)
           (MetasrvClient MetasrvClient)))

(def data_dir "/databend")
(def dir "/opt/databend")
(def log_dir (str dir "/logs"))
(def raft_dir (str dir "/raft"))
(def binary "databend-meta")
;;(def binary_path (str "/home/codedump/metasrv/bin/" binary))
(def binary_path (str dir "/bin/" binary))
(def config_file "/etc/databend-meta-node.toml")
(def logfile (str dir "/metasrv.log"))
(def pidfile (str dir "/metasrv.pid"))
(def raft-api-port 28203)
(def grpc-port 9191)
(def node-id 1)
(def handshake-args ["root" "root" 99999])

(defn parse-long
  "Parses a string to a Long. Passes through `nil`."
  [s]
  (when s (Long/parseLong s)))

(defn node-address
  "An address for connecting to a node on a particular port."
  [node port]
  (str "0.0.0.0" ":" port))

(defn admin-api-address
  "The admin api address."
  [node]
  (node-address node 28101))

(defn grpc-api-address
  "The grpc api address."
  [node]
  (node-address node grpc-port))

(defn raft-listen-host
  "The raft listen host."
  [node]
  (str "0.0.0.0"))

(defn raft-advertise-host
  "The raft advertise host."
  [node]
  (str "0.0.0.0"))

(defn start!
  [node]
  (c/su
  (cu/start-daemon!
      {:logfile logfile
       :pidfile pidfile
       :chdir   dir}
      binary_path 
      :--log-dir log_dir
      :--admin-api-address (admin-api-address node)
      :--grpc-api-address (grpc-api-address  node)
      :--id node-id
      :--raft-dir raft_dir
      :--raft-api-port raft-api-port
      :--raft-listen-host (raft-listen-host node)
      :--raft-advertise-host (raft-advertise-host node)
      :--single)))

(defn start-cluster-node!
  [node]
  (c/su
  (cu/start-daemon!
      {:logfile logfile
       :pidfile pidfile
       :chdir   dir}
      binary_path 
      :--config-file config_file
    )))

(defn install!
  [node version packages_dir]
  (info node " install metasrv " version)
  (c/su
     ;(let [url (str "https://github.com/datafuselabs/databend/releases/download/" version
     ;          "-nightly/databend-" version "-nightly-x86_64-unknown-linux-musl.tar.gz")]
     ;(cu/install-archive! url dir))
     (let [package (str packages_dir "/databend-" version "-nightly-x86_64-unknown-linux-musl.tar.gz")]
    (c/exec :tar :-xf package :--directory dir)
     )
  )
)

(defn install-cluster-node!
  [node version packages_dir]
  (info node " install metasrv " version)
  (c/su
     ;(let [url (str "https://github.com/datafuselabs/databend/releases/download/" version
     ;          "-nightly/databend-" version "-nightly-x86_64-unknown-linux-musl.tar.gz")]
     ;(cu/install-archive! url dir))
     (let [package (str packages_dir "/databend-" version "-nightly-x86_64-unknown-linux-musl.tar.gz")]
    (c/exec :/jepsen/scripts/generate-meta-toml.sh :-l 1)
    (c/exec :tar :-xf package :--directory dir)
     )
  )
)

(defn db
 "metasrv for a particular version."
 [version packages_dir]
 (reify db/DB
  (setup! [_ test node]
   (info node "installing metasrv" version)
   (c/su
    (c/exec :mkdir :-p dir)
    (c/exec :mkdir :-p log_dir)
    (c/exec :mkdir :-p raft_dir))

    (info node "metasrv starting...")

    ;(install! node version packages_dir)
    ;(start! node)
    (install-cluster-node! node version packages_dir)
    (start-cluster-node! node)

    (info node "after metasrv starting...")

    (Thread/sleep 10000))

    (teardown! [_ test node]
      (info node "tearing down metasrv")
      (c/su 
        (cu/stop-daemon! binary pidfile)
        (c/exec :rm :-rf dir)
        (c/exec :rm :-rf data_dir)
        )
      (info node "metasrv killed.")
      )))

(defn r   [_ _] {:type :invoke, :f :read, :value nil})
(defn w   [_ _] {:type :invoke, :f :write, :value (rand-int 5)})
(defn cas [_ _] {:type :invoke, :f :cas, :value [(rand-int 5) (rand-int 5)]})

(defrecord Client [conn]
  client/Client
  (open! [this test node]
    ;; create Meta client
    (info "open metasrv client to" (str node ":" grpc-port))
    (assoc this :conn (MetasrvClient. node grpc-port)))

  (setup! [this test]
    ;; handshake with metasrv
    (info "handshake with metasrv")
    (.handshake conn "root" "root" 99999))

  (invoke! [_ test op]
    (let [[k v] (:value op)]
    (case (:f op)
      :read (let [value (-> conn
          (.readMsg (str (Long/valueOf k)))
          parse-long)]
        (assoc op :type :ok, :value (independent/tuple k value)))      

      :write (do 
        (info "write_msg: " k (type k) v (type v))
        (.writeMsg conn (str (Long/valueOf k)) (str (Integer/valueOf v)))
        (assoc op :type :ok)))))        

  (teardown! [this test])

  (close! [_ test])
)

(defn metasrv-test
  "Given an options map from the command line runner (e.g. :nodes, :ssh,
  :concurrency ...), constructs a test map."
  [opts]
  (info "opts: " opts)
  (merge tests/noop-test
     opts
     {:name "metasrv"
     :pure-generators true
     :os   (if (= (:os opts) "ubuntu") ubuntu/os debian/os)
     :db   (db (:version opts) (:packages_dir opts))
     :nemesis         (nemesis/partition-random-halves)
     :client (Client. nil)
     :checker   (checker/compose
         {:perf  (checker/perf)
         :indep (independent/checker
             (checker/compose
              {:linear   (checker/linearizable {:model (model/cas-register)
                  :algorithm :linear})
              :timeline (timeline/html)}))})
     :generator  (->> (independent/concurrent-generator
           (:concurrency opts) 
           (range)
           (fn [k]
            (->> (gen/mix [r w])
             (gen/stagger 1/50)
             (gen/limit 100))))
         (gen/nemesis
          (cycle [(gen/sleep 5)
           {:type :info, :f :start}
           (gen/sleep 5)
           {:type :info, :f :stop}]))
         (gen/time-limit (:time-limit opts)))
     }))

(def cli-opts
  "Additional command line options."
  [
   [nil "--version version" "Test db version."
    :default  "v0.7.133"
    :parse-fn read-string
    :validate []
   ]
   [nil "--packages_dir dir" "Package dir."
    :default  ""
    :parse-fn str
    :validate []
   ]   
   [nil "--os os" "Test os."
    :default  "debian"
    :parse-fn read-string
    :validate []
   ]
  ])

(defn -main
  "Handles command line arguments. Can either run a test, or a web server for
  browsing results."
  [& args]
  (cli/run! (cli/single-test-cmd {:test-fn metasrv-test
                                  :opt-spec cli-opts})
            args))
