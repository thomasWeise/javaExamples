/** What happens if we access a method of a null object?  */
public class NullPointer {
  /** get the fifth array element */
  static void printToString(final Object o) {
    System.out.println(o.toString());
  }
  /** The main routine 
   *  @param args  we ignore this parameter */
  public static void main(String[] args) {
    printToString(null);
  }
}
