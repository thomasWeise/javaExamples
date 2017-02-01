/** Examples for byte variables */
public class ByteVariables {
  /**
   * The main routine
   * 
   * @param args
   *          we ignore this parameter for now
   */
  public static final void main(final String[] args) {
    byte var; // allocate byte variable "var"

    var = -1; // set variable var to -1
    System.out.println(var); // prints -1

    var = -128; // set variable var to -128
    System.out.println(var); // prints -128
    
    var = 1_2_7; // set variable var to 127
    System.out.println(var); // prints 127
    
    byte hex = 0x10; // set hex to hexadecimal 10, which is 1*16+0 = 16: starts with "0x"
    System.out.println(hex); // prints 16
    
    byte bin = 0b0110_1111; // set bin to binary 01101111, which is 1+2+4+8+32+64=111: starts with "0b"
    System.out.println(bin); // prints 111
  }
}
