/** Example for allocating and using a string arrays and iterating over them */
public class StringArrayNewIterate {
  
  /** The main routine
   * @param args
   *          we ignore this parameter for now */
  public static final void main(String[] args) {
    String[] array = new String[4]; // create an string array for length 4

    array[0] = "hello "; //$NON-NLS-1$
    array[1] = "world"; //$NON-NLS-1$
    array[2] = ", it's "; //$NON-NLS-1$
    array[3] = "me!"; //$NON-NLS-1$
    for (int i = 0; i < 4; i++) { // if length is 4, indexes from 0 to 3 are allowed      
      System.out.print(array[i]); // access an element of array by using "[index]"
    }
  }
}
