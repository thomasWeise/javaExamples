/** An example program specifying two methods of the same name
 *  (but, of course, with different parameters) */
public class MethodsOfSameName {

  static double log(final double number) {
    return Math.log(number);
  }
  
  static double log(final double base, final double number) {
    return log(number) / log(base);
  }
  
  /** The main routine
   * @param args
   *          we ignore this parameter */
  public static final void main(String[] args) {
    System.out.println(log(8d));
    System.out.println(log(2d, 8d));
  }
}
