/** Examples for integer arithmetic overflow */
public class IntegerOverflow {
  /**
   * The main routine
   * 
   * @param args
   *          we ignore this parameter for now
   */
  public static void main(String[] args) {
    int res; // declare int variable res
    
    res = 1_000_000; // store 1_000_000 in variable "res"
    System.out.println(res); // prints 1000000
    res = res * 1000; // store res * 1000 in variable "res" = 1_000_000_000
    System.out.println(res); // prints 1000000000
    
    res = res * 3; // store res * 3 in variable "res", should be 3_000_000_000
    System.out.println(res); // prints -1294967296: res has overflown,
                             // it does _not_ have value 3_000_000_000, but
                             // 3_000_000_000 - Integer.MAX_VALUE + Integer.MIN_VALUE + 1 
  }
}
