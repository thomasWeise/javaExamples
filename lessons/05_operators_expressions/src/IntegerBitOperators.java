/** Examples for bit operators in integer expressions */
public class IntegerBitOperators {
  /**
   * The main routine
   * 
   * @param args
   *          we ignore this parameter for now
   */
  public static void main(String[] args) {
    int res; // declare int variable res
    
    res = 1; // store 1 in variable "res"
    System.out.println(res); // prints 1
    res = res | 1; // binary or with 1, result still 1
    System.out.println(res); // prints 1
    res = res | 8; // binary or with 8, result still 0b1001 = 9
    System.out.println(res); // prints 9
    
    res = res & 24; // binary or of res and 24, where 24 = 8 | 16
    System.out.println(res); // prints 8
    
    res = res ^ 9; // binary xor of 8 and 9, where 9 = 8 | 1, leaves 1
    System.out.println(res); // prints 1
    
    res = ~res; // binary not of 1, set all bits except the first 1
    System.out.println(res); // prints -2
  }
}
