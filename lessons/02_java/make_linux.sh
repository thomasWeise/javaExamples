#!/bin/bash

# strict error handling
set -o pipefail  # trace ERR through pipes
set -o errtrace  # trace ERR through 'time command' and other functions
set -o nounset   # set -u : exit the script if you try to use an uninitialised variable
set -o errexit   # set -e : exit the script if any statement returns a non-true return value

currentDir=`pwd`
echo "We now build all the "Hello World" example directory '$currentDir'."

echo "Building..."
javac HelloWorld.java

echo "Executing program to see result..."
java HelloWorld

echo "Successfully finished building the "Hello World" examples in directory'$currentDir'."