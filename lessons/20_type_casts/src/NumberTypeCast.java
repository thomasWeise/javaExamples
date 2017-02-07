/** Type casting numerical values. */
public class NumberTypeCast {

  /** The main routine
   * @param args
   *          we ignore this parameter for now */
  public static final void main(String[] args) {
    float floatVar = 10f;          // floatVar is an integer value
    System.out.println(floatVar);  // prints 10.0
    int intVar = (int)floatVar;    // cast floatVar to int: truncate
    System.out.println(intVar);    // print 10
    
    floatVar = 10.5f;               // floatVar is not an integer value
    System.out.println(floatVar);   // prints 10.5
    intVar  = (int)floatVar;        // cast floatVar to int: truncate to 10
    System.out.println(intVar);     // print 10
    
    double doubleVar = Math.PI;     // store the mathematical constant `\pi` in doubleVar
    System.out.println(doubleVar);  // prints 3.141592653589793
    floatVar = (float) doubleVar;   // cast to float: loss of precision
    System.out.println(floatVar);   // 3.1415927
    
    long longVar = Long.MAX_VALUE;
    System.out.println(longVar);  // prints 9223372036854775807
    intVar = (int) longVar;       // cast to int: the first 32 bits of longVar are 1
    System.out.println(intVar);   // int now only contains these first 32 bits, we get -1
  }
}
