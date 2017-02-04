/** Examples for boolean variables */
public class BooleanVariables {

  /** The main routine
   * @param args
   *          we ignore this parameter for now */
  public static final void main(final String[] args) {
    boolean var; // allocate boolean variable "var"

    var = true; // set variable var to true
    System.out.println(var); // prints true

    var = false; // set variable var to false
    System.out.println(var);// prints false

    var = false; // set variable var to false
    var = true; // set variable var to true
    System.out.println(var); // prints true

    boolean a = false, b = true, c = false; // allocate and initialize three variables
    System.out.println(a); // print the value of a, which is false
    System.out.println(b); // print the value of b, which is true
    System.out.println(c); // print the value of c, which is false
  }
}
