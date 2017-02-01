/** Examples for long variables */
public class LongVariables {
  /**
   * The main routine
   * 
   * @param args
   *          we ignore this parameter for now
   */
  public static final void main(final String[] args) {
    long var; // allocate long variable "var"

    var = -1L; // set variable var to -1; notice the "L" which marks "long" literals for the compiler
    System.out.println(var); // prints -1

    var = -9223372036854775808L; // set variable var to -9223372036854775808
    System.out.println(var); // prints -9223372036854775808
    
    var = 9_223_372_036_854_775_807L; // set variable var to 9223372036854775807
    System.out.println(var); // prints 9223372036854775807
    
    long hex = 0x10L; // set hex to hexadecimal 10, which is 1*16+0 = 16: starts with "0x"
    System.out.println(hex); // prints 16
    
    long bin = 0b0110_1111L; // set bin to binary 01101111, which is 1+2+4+8+32+64=111: starts with "0b"
    System.out.println(bin); // prints 111
  }
}
