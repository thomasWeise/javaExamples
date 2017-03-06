/** Example for iterating over array elements them in read-only fashion */
public class StringArrayNewFastIterate {

  /** The main routine
   * @param args
   *          we ignore this parameter for now */
  public static final void main(String[] args) {
    String[] array = new String[4]; // create an string array for length 4

    array[0] = "hello "; //$NON-NLS-1$
    array[1] = "world"; //$NON-NLS-1$
    array[2] = ", it's "; //$NON-NLS-1$
    array[3] = "me!"; //$NON-NLS-1$
    for (String str : array) { // str takes on the values of the array elements
      System.out.print(str); // print the value of str during this iteration
    } // prints "hello world, it's me!"
  }
}
