/** An example program computing factorials, defined as `\displaystyle{i! = \prod_{j=1}^i j}`. */
public class FactorialExceptionCatch {

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
    for(int i = -1; i <= 21; i++){ // this time starting loop at -1...
      try {
        long f = factorial(i);
        System.out.println(i + "! = " + f); //$NON-NLS-1$
      } catch (IllegalArgumentException error) {
        System.out.println("Illegal argument: " + error.getMessage()); //$NON-NLS-1$
      } catch (ArithmeticException error) {
        System.out.println("Arithmetic error: " + error.getMessage()); //$NON-NLS-1$
      }
    }
  }
}
