/** Examples for integer arithmetic */
public class IntegerArithmetic {
  /**
   * The main routine
   * 
   * @param args
   *          we ignore this parameter for now
   */
  public static final void main(String[] args) {
    int res; // declare int variable res
    
    res = 5 + 4; // store 5 + 4 in variable "res"
    System.out.println(res); // prints 9
    res = res + 4; // store res + 4 in variable "res"
    System.out.println(res); // prints 13
    res = res + 4; // store res + 4 in variable "res"
    System.out.println(res); // prints 17
    res = 171 / res; // _integer_ divide 171 by "res" (17)
    System.out.println(res); // prints 10
    res = res * 7; // multiply "res" with 7    
    System.out.println(res); // prints 70
    res = res % 8; // rest of the integer division of "res" (70) by 8
    System.out.println(res); // prints 6
    
    res = 3 * 6 + 10 - 4 * 5; // = ((3 * 6) + 10) - (4 *5)
    System.out.println(res); // prints 8
    
    res = 3 * ((6 + 10) - 4) * 5; // now with different grouping
    System.out.println(res); // prints 180
  }
}
