#!/bin/bash

# strict error handling
set -o pipefail  # trace ERR through pipes
set -o errtrace  # trace ERR through 'time command' and other functions
set -o nounset   # set -u : exit the script if you try to use an uninitialised variable
set -o errexit   # set -e : exit the script if any statement returns a non-true return value

currentDir=`pwd`
echo "We now build the examples of all the lessons one by one in directory '$currentDir'."

cd "$currentDir/01_java"
./make_linux.sh

echo "Successfully finished building the examples of all lessons in directory'$currentDir'."