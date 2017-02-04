/** A program testing BinarySearchWrong. */
public class BinarySearchWrongTest {

  /** The main routine
   * @param args
   *          we ignore this parameter */
  public static final void main(String[] args) {
    
    int[] array = {0, 1, 2, 3, 5, 6};
    
    System.out.println("index of 0: " + BinarySearchWrong.binarySearch(array, 0)); //$NON-NLS-1$
    System.out.println("index of 1: " + BinarySearchWrong.binarySearch(array, 1)); //$NON-NLS-1$
    System.out.println("index of 2: " + BinarySearchWrong.binarySearch(array, 2)); //$NON-NLS-1$
    System.out.println("index of 3: " + BinarySearchWrong.binarySearch(array, 3)); //$NON-NLS-1$
    System.out.println("index of 5: " + BinarySearchWrong.binarySearch(array, 5)); //$NON-NLS-1$
    System.out.println("index of 6: " + BinarySearchWrong.binarySearch(array, 6)); //$NON-NLS-1$
    
    System.out.println("index of -1: " + BinarySearchWrong.binarySearch(array, -1)); //$NON-NLS-1$
    System.out.println("index of 4: " + BinarySearchWrong.binarySearch(array, 4)); //$NON-NLS-1$
    System.out.println("index of 7: " + BinarySearchWrong.binarySearch(array, 7)); //$NON-NLS-1$
  }
}
