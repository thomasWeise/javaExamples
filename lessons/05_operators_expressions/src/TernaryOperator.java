/** Examples for boolean operators */
public class TernaryOperator {
  /**
   * The main routine
   * 
   * @param args
   *          we ignore this parameter for now
   */
  public static void main(String[] args) {
    int a = 5, b = 11; // declare and initialize int variables a=5 and b=11
    double c = (a > b) ? -1d : 1d; // if a>b, set c=-1d; otherwise set c=1d;
    System.out.println(c); // prints 1.0
    c = (a >= (b/2)) ? (2d * c) : (2d / c); // if a>=b/2, set c to 2c else to 2/c
    System.out.println(c); // prints 2.0, since b/2 is 5 due to integer division
    boolean d = (c>a) ? true : (a > b); // if c>a, then set d to true, else set d to (a>b)
    System.out.println(d); // false: since c<a, we check whether a>b, which is false
  }
}
