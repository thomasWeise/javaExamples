/** Examples for the limits of float variables */
public class FloatLimits {
  /**
   * The main routine
   * 
   * @param args
   *          we ignore this parameter for now
   */
  public static final void main(final String[] args) {
    float var; // allocate long variable "var"

    var = Float.MIN_VALUE; // set variable var to the minimum positive! float value
    System.out.println(var); // prints 1.4E-45

    var = Float.MIN_NORMAL; // set variable var to the minimum normal float value
    System.out.println(var); // prints 1.17549435E-38

    var = Float.MAX_VALUE; // set variable var to the maximum float value
    System.out.println(var); // prints 3.4028235E38

    int size = Float.SIZE; // set variable size to the size in bits of 1 float
    System.out.println(size); // prints 32

    var = Float.NEGATIVE_INFINITY; // set variable var to negative infinity
    System.out.println(var); // prints -Infinity

    var = Float.POSITIVE_INFINITY; // set variable var to positive infinity
    System.out.println(var); // prints Infinity

    var = Float.NaN; // set variable var to "not a number"
    System.out.println(var); // prints NaN
  }
}
