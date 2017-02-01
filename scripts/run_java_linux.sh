#!/bin/bash

# strict error handling
set -o pipefail  # trace ERR through pipes
set -o errtrace  # trace ERR through 'time command' and other functions
set -o nounset   # set -u : exit the script if you try to use an uninitialised variable
set -o errexit   # set -e : exit the script if any statement returns a non-true return value

file="$1"
class="${1%.class}"
class="$(basename $class)"
echo "Run program '$class' from file '$file'."

java "$class"

echo "Successfully finished running program '$class' from file '$file'."