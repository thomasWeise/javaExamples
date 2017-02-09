/** a try ... finally block*/
public class TryFinally {  
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
    } finally {
      System.out.println(a); // 3
    }
  }
}
