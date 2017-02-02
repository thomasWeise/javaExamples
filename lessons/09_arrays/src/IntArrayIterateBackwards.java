/** Example for iterating backwards over arrays using their length*/
public class IntArrayIterateBackwards {
  /**
   * The main routine
   * 
   * @param args
   *          we ignore this parameter for now
   */
  public static final void main(String[] args) {
    int[] array = new int[5]; // create an integer array for length 5

    System.out.print("Initially, all elements are 0:"); //$NON-NLS-1$
    for (int i = 0; i < array.length; i++) { // indexes are valid from 0 to array.length-1
      System.out.print(' ');
      System.out.print(array[i]); // access an element of array by using "[index]"
    }
    System.out.println();

    array[4] = 5; // set fifth element to 5
    array[2] = 3; // set third element to 3
    array[0] = 1; // set first element to 1
    array[1] = 2; // set second element to 2
    System.out.print("Now some elements are set: "); //$NON-NLS-1$
    for (int i = array.length; (--i) >= 0;) { // iterate backwards is slightly faster
      System.out.print(' ');                  // since we compare i with constance, not variable
      System.out.print(array[i]); // access an element of array by using "[index]"
    }
  }
}
