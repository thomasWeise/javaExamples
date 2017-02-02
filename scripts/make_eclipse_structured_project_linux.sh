#!/bin/bash

# $1: name of project

# strict error handling
set -o pipefail  # trace ERR through pipes
set -o errtrace  # trace ERR through 'time command' and other functions
set -o nounset   # set -u : exit the script if you try to use an uninitialised variable
set -o errexit   # set -e : exit the script if any statement returns a non-true return value

currentDir="$(pwd)"
scriptDir="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

echo "We now build the Eclipse-structured project '$1' in directory '$currentDir'."

binariesDir="$currentDir/bin"
if [[ "$binariesDir" -ef /bin ]]; then
  echo "Warning: binaries directors '$binariesDir' is equivalent to '/bin'."
  exit 1
fi
if [[ "$binariesDir" -ef ~/bin ]]; then
  echo "Warning: binaries directors '$binariesDir' is equivalent to '~/bin'."
  exit 1
fi
  
sourceDir="$currentDir/src"

if [ -d "$binariesDir" ]; then
  echo "Cleaning up."
  rm -rf "$binariesDir"
else
  echo "No cleaning up necessary, binaries directory does not exist."
fi
mkdir "$binariesDir"

echo "Building..."
cd "$sourceDir"
javac -d "$binariesDir" $(find "$sourceDir" -name "*.java" -type f | grep ".java$")

echo "Executing programs to see result..."
find . -type f -name "*.java" -exec grep -q 'public static final void main(' {} \; -exec "$scriptDir/run_java_linux.sh" {} "$binariesDir" "$sourceDir" \;

echo "Successfully finished building the Eclipse-structured project '$1' in directory'$currentDir'."