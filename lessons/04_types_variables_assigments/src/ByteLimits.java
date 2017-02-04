/** Examples for the limits of byte variables */
public class ByteLimits {

  /** The main routine
   * @param args
   *          we ignore this parameter for now */
  public static final void main(final String[] args) {
    byte var; // allocate byte variable "var"

    var = Byte.MIN_VALUE; // set variable var to the minimum byte value
    System.out.println(var); // prints -128

    var = Byte.MAX_VALUE; // set variable var to the maximum byte value
    System.out.println(var); // prints 127

    var = Byte.SIZE; // set variable var to the size in bits of 1 byte
    System.out.println(var); // prints 8
  }
}
