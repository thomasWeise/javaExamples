/** An example program computing Fibonacci numbers $F(n)=F(n-1)+F(n-2)$ with
 *  $F(1)=F(2)=1$ recursively. */
public class FibonacciRecursive {

  /** Recursively compute the ith Fibonacci number
   * @param i the index of the number to compute
   * @return ith Fibonacci number 
   */
  static long F(long i) {
    if((i == 1L) || (i == 2L)) { 
      return 1L; // take care of cases F(1) and F(2)
    }
    return F(i-1L) + F(i-2L); // recurse
  }

  /**
   * The main routine
   * 
   * @param args
   *          we ignore this parameter
   */
  public static final void main(String[] args) {
    for(long i = 1L; i <= 40L; i++){ // print the first 40 Fibonacci numbers
      System.out.print("F("); //$NON-NLS-1$
      System.out.print(i);
      System.out.print(") = "); //$NON-NLS-1$
      System.out.println(F(i));
    }
  }
}
