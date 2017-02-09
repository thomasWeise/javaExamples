/** An example program computing factorials, defined as `\displaystyle{i! = \prod_{j=1}^i j}`. */
public class FactorialException {

  /** Compute the factorial of i
   * @return `\displaystyle{i! = \prod_{j=1}^i j}` */
  static long factorial(int i) {
    long result = 1L;
    if(i < 0)  { throw new IllegalArgumentException(i + "! is undefined."); } //$NON-NLS-1$
    if(i > 20) { throw new ArithmeticException(i + "! exceeds the range of long."); } //$NON-NLS-1$
    for(int v = i; v > 1; --v) {
      result *= v;
    }
    return result;
  }

  /** The main routine
   * @param args
   *          we ignore this parameter */
  public static final void main(String[] args) {
    for(int i = 0; i <= 21; i++){ // printing the first 22 factorials, exception at 21!
      System.out.print(i);
      System.out.print("! = "); //$NON-NLS-1$
      System.out.println(factorial(i));
    }
  }
}
