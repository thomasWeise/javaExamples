/** The same primitive value not necessarily wraps to the same object */
public class DoubleNotEqualsDouble {
  /** The main routine 
   *  @param args  we ignore it */
  public static void main(String[] args) {
    double x, y;
    Double a, b;
    
    x = 0d;
    y = 0d;
    System.out.println(x == y); // true
    
    a = x;
    b = y;
    System.out.println(a == b); // false
    
    x = a;
    y = b;
    System.out.println(x == y); // true
  }
}
