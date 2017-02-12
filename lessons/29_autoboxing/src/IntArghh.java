/** The same primitive value not necessarily wraps to the same object */
public class IntArghh {
  /** The main routine 
   *  @param args  we ignore it */
  public static void main(String[] args) {
    Integer a, b;
    
    a = 100;
    b = 100;
    System.out.println(a == b); // true : compares references, but 100<127..
    System.out.println(a < b);  // false: compares unboxed values
    System.out.println(a <= b); // true : compares unboxed values
    System.out.println(a > b);  // false: compares unboxed values
    System.out.println(a >= b); // true : compares unboxed values
    System.out.println(a != b); // false: compares references, but 100<127..
  }
}
