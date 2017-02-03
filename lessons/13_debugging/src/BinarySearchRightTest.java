/** A program testing BinarySearchRight. */
public class BinarySearchRightTest {

  /**
   * The main routine
   * 
   * @param args
   *          we ignore this parameter for now
   */
  public static final void main(String[] args) {
    
    int[] array = {0, 1, 2, 3, 5, 6};
    
    System.out.println("index of 0: " + BinarySearchRight.binarySearch(array, 0)); //$NON-NLS-1$
    System.out.println("index of 1: " + BinarySearchRight.binarySearch(array, 1)); //$NON-NLS-1$
    System.out.println("index of 2: " + BinarySearchRight.binarySearch(array, 2)); //$NON-NLS-1$
    System.out.println("index of 3: " + BinarySearchRight.binarySearch(array, 3)); //$NON-NLS-1$
    System.out.println("index of 5: " + BinarySearchRight.binarySearch(array, 5)); //$NON-NLS-1$
    System.out.println("index of 6: " + BinarySearchRight.binarySearch(array, 6)); //$NON-NLS-1$
    
    System.out.println("index of -1: " + BinarySearchRight.binarySearch(array, -1)); //$NON-NLS-1$
    System.out.println("index of 4: " + BinarySearchRight.binarySearch(array, 4)); //$NON-NLS-1$
    System.out.println("index of 7: " + BinarySearchRight.binarySearch(array, 7)); //$NON-NLS-1$
  }
}
