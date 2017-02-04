/** Example for allocating and using a string arrays and accessing their values */
public class StringArrayNewAccess {

  /** The main routine
   * @param args
   *          we ignore this parameter for now */
  public static final void main(String[] args) {
    String[] array = new String[4]; // create an string array for length 4

    array[0] = "hello "; //$NON-NLS-1$
    array[1] = "world"; //$NON-NLS-1$
    array[2] = ", it's "; //$NON-NLS-1$
    array[3] = "me!"; //$NON-NLS-1$

    System.out.print(array[0]);
    System.out.print(array[1]);
    System.out.print(array[2]);
    System.out.println(array[3]);
    
    array[3] = "Ni Hao "; //$NON-NLS-1$
    
    System.out.print(array[3]);
    System.out.print(array[1]);
    System.out.print(array[2]);
    System.out.print(array[0]);
  }
}
