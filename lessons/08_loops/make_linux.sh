#!/bin/bash

# strict error handling
set -o pipefail  # trace ERR through pipes
set -o errtrace  # trace ERR through 'time command' and other functions
set -o nounset   # set -u : exit the script if you try to use an uninitialised variable
set -o errexit   # set -e : exit the script if any statement returns a non-true return value

"../../scripts/make_eclipse_structured_project_linux.sh" 'loops' noExec

cd bin
java VerticalBallThrowDoWhileLoop
java VerticalBallThrowForLoop
java VerticalBallThrowForLoopBetter1
java VerticalBallThrowForLoopBetter2
java VerticalBallThrowForLoopStrange1
java VerticalBallThrowForLoopStrange2
java VerticalBallThrowMultiple
java VerticalBallThrowWhileLoop1
java VerticalBallThrowWhileLoop2
echo "1
2
3" | java VerticalBallThrowWhileLoopSystemIn