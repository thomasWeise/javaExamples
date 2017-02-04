/** Examples for integer variables */
public class IntVariables {

  /** The main routine
   * @param args
   *          we ignore this parameter for now */
  public static final void main(final String[] args) {
    int var; // allocate integer variable "var"

    var = -1; // set variable var to -1
    System.out.println(var); // prints -1

    var = -2147483648; // set variable var to -2147483648
    System.out.println(var); // prints -2147483648
    
    var = 2_147_483_647; // set variable var to 2147483647
    System.out.println(var); // prints 2147483647
    
    int hex = 0x10; // set hex to hexadecimal 10, which is 1*16+0 = 16: starts with "0x"
    System.out.println(hex); // prints 16
    
    int bin = 0b0110_1111; // set bin to binary 01101111, which is 1+2+4+8+32+64=111: starts with "0b"
    System.out.println(bin); // prints 111
  }
}
