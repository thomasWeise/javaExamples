#!/bin/bash

# strict error handling
set -o pipefail  # trace ERR through pipes
set -o errtrace  # trace ERR through 'time command' and other functions
set -o nounset   # set -u : exit the script if you try to use an uninitialised variable
set -o errexit   # set -e : exit the script if any statement returns a non-true return value

currentDir=`pwd`
echo "We now build all the Eclipse "Hello World" example directory '$currentDir'."

binariesDir="$currentDir/bin"
sourceDir="$currentDir/src"

echo "Cleaning up."
cd "$binariesDir"
rm *.class || true

echo "Building..."
cd "$sourceDir"
javac -d "$binariesDir" HelloWorld.java

echo "Executing program to see result..."
cd "$binariesDir"
java HelloWorld

echo "Successfully finished building the Eclipse "Hello World" examples in directory'$currentDir'."