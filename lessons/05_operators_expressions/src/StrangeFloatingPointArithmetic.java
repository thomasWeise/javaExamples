/** A class showing the results of strange (expected) floating point arithmetic expressions. */
public class StrangeFloatingPointArithmetic {
  /** The main routine
   * @param args we ignore this parameter for now */
  public static final void main(String[] args) {
    double a = (10 / 3);                  // What result would you expect from 10/3 on a calculator?
    System.out.println(a);                // What did you actually get?
    double b = 1.5d - (0.3d / 0.2d);      // What is 0.3/0.2? What would you expect 1.5 - 0.3/0.2 to be?
    System.out.println(b);                // What did you actually get?
    double c = 1.5d - (3d / 2d);          // OK, same as b, but we use 3/2 instead of 0.3/0.2
    System.out.println(c);                // Do we get the same result for 1.5-(3/2) as for 1.5-(0.3/0.2)?
    boolean d = (0.3d/0.2d) == (3d/0.2d); // In other words, should this be true or false?
    System.out.println(d);                // What is it actually?    
  }
}
