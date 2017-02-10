/** a try ... catch ... finally block*/
public class TryCatchFinally {  
  /** The main routine 
   *  @param args  we ignore this parameter */
  public static void main(String[] args) {
    int a = 0;
    try {
      System.out.println(a); // 0
      a++;
      System.out.println(a); // 1
      a *= 3;
      System.out.println(a); // 3
      a /= 0;
      System.out.println(a); // never reached
      a -= 5;
      System.out.println(a); // never reached
    } catch(ArithmeticException error) {
      System.out.println("Error: " + //$NON-NLS-1$
                   error.getMessage()); // Error: / by zero
    } finally {
      System.out.println(a); // 3
    }
  }
}
