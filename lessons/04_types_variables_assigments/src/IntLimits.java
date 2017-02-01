/** Examples for the limits of integer variables */
public class IntLimits {
  /**
   * The main routine
   * 
   * @param args
   *          we ignore this parameter for now
   */
  public static final void main(final String[] args) {
    int var; // allocate int variable "var"

    var = Integer.MIN_VALUE; // set variable var to the minimum int value
    System.out.println(var); // prints -2147483648

    var = Integer.MAX_VALUE; // set variable var to the maximum int value
    System.out.println(var); // prints 2147483647

    var = Integer.SIZE; // set variable var to the size in bits of 1 int
    System.out.println(var); // prints 32
  }
}
