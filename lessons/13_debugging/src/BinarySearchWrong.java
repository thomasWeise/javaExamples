/** An erroneous implementation of Binary Search */
public class BinarySearchWrong {

  /** Find the index of value "search" in the sorted array "array".
   * @param array the array to search inside, must be sorted
   * @param search the value to search
   * @return the index of search, or -1 if it does not occur in "array"
   */
  static int binarySearch(int[] array, int search) {
    int lowerBound = 0; // the index of the first array element
    int upperBound = array.length - 1; // the index of the last array element

    while (lowerBound < upperBound) { // as long as current division is not empty
      int midIndex = (lowerBound + upperBound) / 2; // compute mid index

      if (array[midIndex] < search) { // if element in middle is smaller than search
        lowerBound = midIndex + 1; // search only above the middle from now on
      } else { // otherwise
        if (array[midIndex] > search) { // if element is bigger than search
          upperBound = midIndex - 1; // search only below the middle from now on
        } else { // ok, element is neither smaller or bigger, so it must be equal
          return midIndex; // then array[midIndex] == search must hold
        }
      }
    }
    return -1; // we did not find the element
  }
}
