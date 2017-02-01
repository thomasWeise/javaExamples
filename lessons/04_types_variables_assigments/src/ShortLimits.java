/** Examples for the limits of short variables */
public class ShortLimits {
  /**
   * The main routine
   * 
   * @param args
   *          we ignore this parameter for now
   */
  public static final void main(final String[] args) {
    short var; // allocate short variable "var"

    var = Short.MIN_VALUE; // set variable var to the minimum short value
    System.out.println(var); // prints -32768

    var = Short.MAX_VALUE; // set variable var to the maximum byte value
    System.out.println(var); // prints 32767

    var = Short.SIZE; // set variable var to the size in bits of 1 short
    System.out.println(var); // prints 16
  }
}
