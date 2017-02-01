#!/bin/bash

# strict error handling
set -o pipefail  # trace ERR through pipes
set -o errtrace  # trace ERR through 'time command' and other functions
set -o nounset   # set -u : exit the script if you try to use an uninitialised variable
set -o errexit   # set -e : exit the script if any statement returns a non-true return value

currentDir=`pwd`
echo "We now build the examples of the types, variables, and assignments in directory '$currentDir'."

binariesDir="$currentDir/bin"
sourceDir="$currentDir/src"

echo "Cleaning up."
cd "$binariesDir"
rm *.class || true

echo "Building..."
cd "$sourceDir"
find . -mindepth 1 -maxdepth 1 -name "*.java" -type f -execdir javac -d "$binariesDir" "{}" \;

echo "Executing programs to see result..."
cd "$binariesDir"
find . -mindepth 1 -maxdepth 1 -name "*.class" -type f -execdir "../../../scripts/run_java_linux.sh" "{}" \;

echo "Successfully finished building the examples of the types, variables, and assignments in directory'$currentDir'."