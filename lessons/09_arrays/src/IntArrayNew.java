/** Example for allocating and using a int arrays */
public class IntArrayNew {
  /**
   * The main routine
   * 
   * @param args
   *          we ignore this parameter for now
   */
  public static final void main(String[] args) {
    int[] array = new int[5]; // create an integer array for length 5

    System.out.print("Initially, all elements are 0:"); //$NON-NLS-1$
    for (int i = 0; i < 5; i++) { // if length is 5, indexes from 0 to 4 are allowed
      System.out.print(' ');
      System.out.print(array[i]); // access an element of array by using "[index]"
    }
    System.out.println();

    array[4] = 5; // set fifth element to 5
    array[2] = 3; // set third element to 3
    array[0] = 1; // set first element to 1
    array[1] = 2; // set second element to 2
    System.out.print("Now some elements are set: "); //$NON-NLS-1$
    for (int i = 0; i < 5; i++) { // if length is 5, indexes from 0 to 4 are allowed
      System.out.print(' ');
      System.out.print(array[i]); // access an element of array by using "[index]"
    }
  }
}
