#!/bin/bash

# strict error handling
#set -o pipefail  # trace ERR through pipes
#set -o errtrace  # trace ERR through 'time command' and other functions
#set -o nounset   # set -u : exit the script if you try to use an uninitialised variable
#set -o errexit   # set -e : exit the script if any statement returns a non-true return value

"../../scripts/make_eclipse_structured_project_linux.sh" 'conditionals' noExec

echo "Now building output files (and testing whether the programs work while we are at it)."
cd "bin"

echo "Charles
m
" | java HelloIfThenElse

echo "Elisabeth
f
" | java HelloIfThenElse

echo "Zork
zork
" | java HelloIfThenElse

echo "Charles
m
" | java HelloSwitchCase

echo "Elisabeth
f
" | java HelloSwitchCase

echo "Zork
zork
" | java HelloSwitchCase