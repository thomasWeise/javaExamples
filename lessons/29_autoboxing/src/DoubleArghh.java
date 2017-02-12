/** The same primitive value not necessarily wraps to the same object */
public class DoubleArghh {
  /** The main routine 
   *  @param args  we ignore it */
  public static void main(String[] args) {
    Double a, b;
    
    a = 0d;
    b = 0d;
    System.out.println(a == b); // false: compares references
    System.out.println(a < b);  // false: compares unboxed values
    System.out.println(a <= b); // true : compares unboxed values
    System.out.println(a > b);  // false: compares unboxed values
    System.out.println(a >= b); // true : compares unboxed values
    System.out.println(a != b); // true : compares references
  }
}
