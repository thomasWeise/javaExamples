/** Examples for double variables */
public class DoubleVariables {

  /** The main routine
   * @param args
   *          we ignore this parameter for now */
  public static final void main(final String[] args) {
    double var; // allocate double variable "var"

    var = -1d; // set variable var to -1; notice the "d" marking the "double" literal for the compiler
    System.out.println(var); // prints -1
    
    double fraction = 0.8d; // allocate and set variable faction to 0.8
    System.out.println(fraction); // prints 0.8

    var = 4.9e-324d; // set variable var to 4.9 * 10^-324 The "E" means "10^"
    System.out.println(var); // prints 4.9E-324
    
    var = 1.7976931348623157e308d; // set variable var to 1.7976931348623157 * 10^308
    System.out.println(var); // prints 1.7976931348623157E308d
    
    double pi = 3.141592653589793238462643383279502884197169399375105820974944592307816406286d; // set pi to, well, pi
    System.out.println(pi); // prints 3.141592653589793 <- precision of double is about 15 decimals 
  }
}
