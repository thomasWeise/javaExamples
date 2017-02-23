/** Examples for float variables */
public class FloatVariables {

  /** The main routine
   * @param args
   *          we ignore this parameter for now */
  public static final void main(final String[] args) {
    float var; // allocate float variable "var"

    var = -1f; // set variable var to -1; notice the "f" marking the "float" literal for the compiler
    System.out.println(var); // prints -1.0
    
    float fraction = 0.8f; // allocate and set variable faction to 0.8
    System.out.println(fraction); // prints 0.8

    var = 1.4e-45f; // set variable var to `1.4 * 10^{-45}`, the "aaaExxx" means "`aaa*10^{xxx}`"
    System.out.println(var); // prints 1.4E-45
    
    var = 3.4028235e38f; // set variable var to `3.4028235*10^{38}`
    System.out.println(var); // prints 4028235E38
    
    float pi = 3.141592653589793238462643383279502884197169399375105820974944592307816406286f; // set pi to, well, `\pi`
    System.out.println(pi); // prints 3.1415927 <- precision of float is about 7 decimals 
  }
}
