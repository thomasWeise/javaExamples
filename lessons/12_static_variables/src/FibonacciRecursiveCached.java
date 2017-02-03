/** An example program computing Fibonacci numbers $F(n)=F(n-1)+F(n-2)$
 * with $F(1)=F(2)=1$ recursively using a cache for faster computation. */
public class FibonacciRecursiveCached {

  /** a cache variable */
  static long[] CACHE = new long[1000];

  /**
   * Recursively compute the ith Fibonacci number
   * 
   * @param i
   *          the index of the number to compute
   * @return ith Fibonacci number
   */
  static long F(int i) {
    if ((i == 1L) || (i == 2L)) {
      return 1; // take care of cases F(1) and F(2)
    }
    if (i < CACHE.length) { // is i small enough to use the cache?
      if (CACHE[i] > 0) { // has F(i) already been computed ?
        return CACHE[i]; // yes, then we can directly return it
      }
      return CACHE[i] = F(i-1) + F(i-2); // no? recurse and cache result
    }
    return F(i-1) + F(i-2); // i is too big, just recurse
  }

  /**
   * The main routine
   * 
   * @param args
   *          we ignore this parameter
   */
  public static final void main(String[] args) {
    for (int i = 1; i <= 90; i++) { // print the first 90 Fibonacci numbers
      System.out.print("F("); //$NON-NLS-1$
      System.out.print(i);
      System.out.print(") = "); //$NON-NLS-1$
      System.out.println(F(i));
    }
  }
}
