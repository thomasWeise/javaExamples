/** Examples for short variables */
public class ShortVariables {

  /** The main routine
   * @param args
   *          we ignore this parameter for now */
  public static final void main(final String[] args) {
    short var; // allocate short variable "var"

    var = -1; // set variable var to -1
    System.out.println(var); // prints -1

    var = -32768; // set variable var to -32768
    System.out.println(var); // prints -32768
    
    var = 3_2767; // set variable var to 32767
    System.out.println(var); // prints 32767
    
    short hex = 0x10; // set hex to hexadecimal 10, which is 1*16+0 = 16: starts with "0x"
    System.out.println(hex); // prints 16
    
    short bin = 0b0110_1111; // set bin to binary 01101111, which is 1+2+4+8+32+64=111: starts with "0b"
    System.out.println(bin); // prints 111
  }
}
