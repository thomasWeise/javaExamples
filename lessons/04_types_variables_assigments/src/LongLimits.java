/** Examples for the limits of long variables */
public class LongLimits {

  /** The main routine
   * @param args
   *          we ignore this parameter for now */
  public static final void main(final String[] args) {
    long var; // allocate long variable "var"

    var = Long.MIN_VALUE; // set variable var to the minimum long value
    System.out.println(var); // prints -9223372036854775808

    var = Long.MAX_VALUE; // set variable var to the maximum long value
    System.out.println(var); // prints 9223372036854775807

    var = Long.SIZE; // set variable var to the size in bits of 1 long
    System.out.println(var); // prints 64
  }
}
