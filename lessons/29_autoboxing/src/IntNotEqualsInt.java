/** The same primitive value not necessarily wraps to the same object */
public class IntNotEqualsInt {
  /** The main routine 
   *  @param args  we ignore it */
  public static void main(String[] args) {
    int x, y;
    Integer a, b;
    
    x = 1000;
    y = 1000;
    System.out.println(x == y); // true
    
    a = x;
    b = y;
    System.out.println(a == b); // false
    
    x = a;
    y = b;
    System.out.println(x == y); // true
  }
}
