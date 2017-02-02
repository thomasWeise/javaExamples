#!/bin/bash

# $1: path to class file
# $2: root path to binaries folder, use current directory if not specified
# $3: root path to source folder, use current directory if not specified

# strict error handling
set -o pipefail  # trace ERR through pipes
set -o errtrace  # trace ERR through 'time command' and other functions
set -o nounset   # set -u : exit the script if you try to use an uninitialised variable
set -o errexit   # set -e : exit the script if any statement returns a non-true return value

# compute the relative path
relpath(){ python -c "import os.path; print os.path.relpath('$1','${2:-$PWD}')" ; }

# get the full path of the class file
programFile=$(readlink -m "$1")
# echo "The full path to the program file is '$programFile'."

currentDir="$(pwd)"
# echo "The current directory is '$currentDir'."

binariesFolder="${2:-}"
if [[ -z "$binariesFolder" ]]; then
  binariesFolder="$currentDir"
fi
binariesFolder="$(readlink -m $binariesFolder)"
# echo "The root folder for binaries is '$binariesFolder'."

if [[ ${programFile: -5} == ".java" ]]; then
#  echo "The program file is actually a Java file. We first relativize its path to the source root folder."
  
  sourceFolder="${3:-}"
  if [[ -z "$sourceFolder" ]]; then
    sourceFolder="$currentDir"
  fi
  sourceFolder=$(readlink -m "$sourceFolder")
#  echo "The root folder for source code is '$sourceFolder'."
  
  classFile=$(relpath "$programFile" "$sourceFolder")
#  echo "The program file '$programFile' has relative path '$classFile' to source folder '$sourceFolder'."
  classFile="${classFile%.java}"
else
#  echo "The file is a class file, we relativize it towards the binaries folder '$binariesFolder'."
  classFile=$(relpath "$programFile" "$binariesFolder")
#  echo "The program file '$programFile' has relative path '$classFile' to binaries folder '$binariesFolder'."
  if [[ ${classFile: -6} == ".class" ]]; then  
    classFile="${classFile%.class}"
  fi
fi

classFile="${classFile//\//.}"
echo "Now executing program '$1' ('$programFile') as '$classFile' in folder '$binariesFolder'."

cd "$binariesFolder"

java "$classFile"
retCode=$?

echo "Finished executing program '$1' ('$programFile') as '$classFile' in folder '$binariesFolder', program returned exit code '$retCode'."
exit $retCode