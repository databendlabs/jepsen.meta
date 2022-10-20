#!/usr/bin/env bash

set -o errexit
set -o pipefail
set -o nounset
# set -o xtrace

ERROR() {
    printf "\e[101m\e[97m[ERROR]\e[49m\e[39m %s\n" "$@"
}

WARNING() {
    printf "\e[101m\e[97m[WARNING]\e[49m\e[39m %s\n" "$@"
}

INFO() {
    printf "\e[104m\e[97m[INFO]\e[49m\e[39m %s\n" "$@"
}

exists() {
    type "$1" > /dev/null 2>&1
}

# Node 1 is Leader by default
LEADER=1
POSITIONAL=()
HELP=0
NODE=`hostname`
NODE=`echo ${NODE: 1}`

echo "Generating Node $NODE toml file..."

while [[ $# -gt 0 ]]
do
    key="$1"

    case $key in
    --help)
        HELP=1
        shift # past argument
        ;;    
    -l|--leader)
      LEADER=$2
      shift
      shift
      ;;
    *)
      POSITIONAL+=("$1")
      ERROR "unknown option $1"
      shift # past argument
      ;;
    esac
done    

if [ "${#POSITIONAL[@]}" -gt 0 ]; then
  set -- "${POSITIONAL[@]}" # restore positional parameters
fi

if [ "${HELP}" -eq 1 ]; then
    echo "Usage: $0 [OPTION]"
    echo "  --help                                                Display this message"
    echo "  --leader NODEID                                       Meta Leader Node Id of this cluster."
    echo "To provide multiple additional docker-compose args, set the COMPOSE var directly, with the -f flag. Ex: COMPOSE=\"-f FILE_PATH_HERE -f ANOTHER_PATH\" ./up.sh --dev"
    exit 0
fi

export LEADER
export NODE

# Start a leader or a follower?
if [[ "$NODE" == "$LEADER" ]]; then
  echo "Start Node $NODE as a Leader"
  cat /jepsen/etc/databend-meta-leader-template.toml | 
    awk ' {gsub(/%%NODE%%/, ENVIRON["NODE"]); print} ' \
    > /etc/databend-meta-node.toml
else
  echo "Start Node $NODE as a Follower"
  cat /jepsen/etc/databend-meta-follower-template.toml | 
    awk ' {gsub(/%%NODE%%/, ENVIRON["NODE"]); print} ' |
    awk ' {gsub(/%%LEADER%%/, ENVIRON["LEADER"]); print} ' \
    > /etc/databend-meta-node.toml
fi

