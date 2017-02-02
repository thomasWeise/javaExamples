#!/bin/bash

# strict error handling
#set -o pipefail  # trace ERR through pipes
#set -o errtrace  # trace ERR through 'time command' and other functions
#set -o nounset   # set -u : exit the script if you try to use an uninitialised variable
#set -o errexit   # set -e : exit the script if any statement returns a non-true return value

"../../scripts/make_eclipse_structured_project_linux.sh" 'console I/O' noExec

echo "Now building output files."
cd "bin"
java SystemOut > ../output/SystemOut.txt

java SystemOut | head -n 3 > ../output/SystemOutToHead.txt
java SystemOut | sed 's/blubb/COOL!/g' > ../output/SystemOutToSED.txt

java SystemIn < ../output/SystemOut.txt > ../output/SystemOutToSystemInViaFile.txt
java SystemOut | java SystemIn > ../output/SystemOutToSystemInViaPipe.txt

java SystemInSystemErr < ../output/SystemOut.txt > ../output/SystemOutToSystemInSystemErrViaFile.txt
java SystemOut | java SystemInSystemErr > ../output/SystemOutToSystemInSystemErrViaPipe.txt

echo "2
23
3
" | java VerticalBallThrowRevisited