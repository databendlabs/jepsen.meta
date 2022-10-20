(defproject jepsen.metasrv "0.1.0-SNAPSHOT"
  :description "A Jepsen test for etcd"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :main jepsen.metasrv
  ; import local metasrv java client sdk jar
  :resource-paths ["resources/metasrv-java-client-1.0.jar"]
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [jepsen "0.2.6-SNAPSHOT"]
                 [io.grpc/grpc-protobuf "1.48.0"]
                 [io.grpc/grpc-stub "1.48.0"]
                 [io.grpc/grpc-netty-shaded "1.48.0"]]
  :repositories [["central" "http://maven.aliyun.com/nexus/content/groups/public"]
                 ["clojars" "https://mirrors.tuna.tsinghua.edu.cn/clojars/"]]                 
                 )

(require 'cemerick.pomegranate.aether)
(cemerick.pomegranate.aether/register-wagon-factory!
 "http" #(org.apache.maven.wagon.providers.http.HttpWagon.))