/** Examples for comparison operators */
public class ComparisonOperators {
 
  /** The main routine
   * @param args
   *          we ignore this parameter for now */
  public static final void main(String[] args) {
    double a = 5d, b = 6d; // allocate and initialize two double variables
    boolean c = (a == b); // allocate boolean c is true if a==b, false otherwise
    System.out.println(c); // false
    boolean d = (a < b); // allocate boolean d, set to true iff a < b
    System.out.println(d); // true
    boolean e = (c == d); // allocate boolean e, set to true if boolean c == boolean d
    System.out.println(e); // false
    e = (c = d); // careful here: (c = d) is not a comparison but in-place assignment...
    System.out.println(e); // true
    e = (((71d - 0.1d) - 71d) + 0.1d) == 0d; // should be 0, but remember limited precision...
    System.out.println(e); // false: never use == or != with floating point, use >=, <=, <, > only
    e = (5.4d != 4.5d); // is 5.4 different from 4.5?
    System.out.println(e); // true, ok, if that would not work, we would have a serious problem :-)
  }
}
