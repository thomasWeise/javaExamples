/** This class shows what happens if we access an array element out of the bounds */
public class ArrayIndexOutOfBounds {
  /** get the fifth array element */
  static int getFifth(final int[] array) {
    return array[4];
  }
  /** The main routine 
   *  @param args  we ignore this parameter */
  public static void main(String[] args) {
    System.out.println(getFifth(new int[] {1, 2, 3}));
  }
}
