/** Examples for the limits of double variables */
public class DoubleLimits {
  /**
   * The main routine
   * 
   * @param args
   *          we ignore this parameter for now
   */
  public static final void main(final String[] args) {
    double var; // allocate long variable "var"

    var = Double.MIN_VALUE; // set variable var to the minimum positive! double value
    System.out.println(var); // prints 4.9E-324

    var = Double.MIN_NORMAL; // set variable var to the minimum normal double value
    System.out.println(var); // prints 2.2250738585072014E-308

    var = Double.MAX_VALUE; // set variable var to the maximum double value
    System.out.println(var); // prints 1.7976931348623157E308

    int size = Double.SIZE; // set variable size to the size in bits of 1 double
    System.out.println(size); // prints 64

    var = Double.NEGATIVE_INFINITY; // set variable var to negative infinity
    System.out.println(var); // prints -Infinity

    var = Double.POSITIVE_INFINITY; // set variable var to positive infinity
    System.out.println(var); // prints Infinity

    var = Double.NaN; // set variable var to "not a number"
    System.out.println(var); // prints NaN
  }
}
