# jepsen.metasrv

databend metasrv jepsen test unit.

## Usage

### step 1: build metasrv java client
Go to `metasrv-java-client` directory run `gradle build` to build metasrv java client jar, copy `metasrv-java-client/build/libs/metasrv-java-client-1.0.jar` into `resources`.

### step 2: download databend package
Assume that you want to test Version `v0.8.77` of databend metasrv, first need to download the databend release package and copy it to `docker/packages`:

```
wget https://github.com/datafuselabs/databend/releases/download/v0.8.77-nightly/databend-v0.8.77-nightly-x86_64-unknown-linux-musl.tar.gz -P docker/packages
```

Replace `v0.8.77` to any version you want to test.

### step 3: start docker test containers
run `cd docker; ./bin/up`, it will start two types of container:

* node container: which will run the meta service, by default there will be 3 node container, if need to change the node count, modify the `bin/up` script.
* console container: which will run the jepsen test script.

After the container, run `docker ps` will see 4 containers:
```
$ docker ps
CONTAINER ID   IMAGE                      COMMAND                  CREATED          STATUS          PORTS                                                                                  NAMES
1754a0157421   jepsen_control             "/bin/sh -c /init.sh"    41 seconds ago   Up 40 seconds   0.0.0.0:49157->22/tcp, :::49157->22/tcp, 0.0.0.0:49156->8080/tcp, :::49156->8080/tcp   jepsen-control
7eb1ad9c5630   jepsen_n2                  "/usr/local/bin/boot…"   9 hours ago      Up 40 seconds   0.0.0.0:49154->22/tcp, :::49154->22/tcp                                                jepsen-n2
72090d630981   jepsen_n1                  "/usr/local/bin/boot…"   9 hours ago      Up 40 seconds   0.0.0.0:49153->22/tcp, :::49153->22/tcp                                                jepsen-n1
940141d56e42   jepsen_n3                  "/usr/local/bin/boot…"   9 hours ago      Up 40 seconds   0.0.0.0:49155->22/tcp, :::49155->22/tcp                                                jepsen-n3
```

### step 4: run jepsen test in control container
Run `./bin/console` in `docker` directory, it will enter the control container, and use the cmd like below to test metasrv:

```
lein run test --nodes jepsen-n1,jepsen-n2,jepsen-n3 --time-limit 5 --concurrency 5 --version v0.8.77 --packages_dir=/var/jepsen/shared/packages/
```

* --nodes: the node hostname which will run the metasrv, seperated by comma.
* --time-limt: test time of duration, in Seconds.
* --concurrency: concurrency test client count.
* --version: the package version download in `step 2`.
* --packages_dir: Package directory, MUST not to modified.

Note that the more `nodes`,`time-limit` and `concurrency`, the more test result, it will make the checker hard to analyse. In now time, the default arguments is enough.

