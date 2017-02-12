/** The same primitive value not necessarily wraps to the same object */
public class IntArghhOh {
  /** The main routine 
   *  @param args  we ignore it */
  public static void main(String[] args) {
    Integer a, b;
    
    a = 1000;
    b = 1000;
    System.out.println(a == b); // false: compares references
    System.out.println(a < b);  // false: compares unboxed values
    System.out.println(a <= b); // true : compares unboxed values
    System.out.println(a > b);  // false: compares unboxed values
    System.out.println(a >= b); // true : compares unboxed values
    System.out.println(a != b); // true : compares references
  }
}
