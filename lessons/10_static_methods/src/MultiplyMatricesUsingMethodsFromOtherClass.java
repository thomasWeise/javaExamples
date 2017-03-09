/** An example program printing and multiplying matrices
 *  using our other program MultiplyMatrices.  */
public class MultiplyMatricesUsingMethodsFromOtherClass {

  /** The main routine
   * @param args
   *          we ignore this parameter */
  public static final void main(String[] args) {
    double[][] a = { { 4d, 3d }, { 2d, 1d } }; // allocate and initialize first matrix
    double[][] b = { { -0.5d, 1.5d }, { 1d, -2d } }; // allocate and initialize second matrix
    
    MultiplyMatrices.print(a, "a");// call a procedure printing a //$NON-NLS-1$
    MultiplyMatrices.print(b, "b");// call a procedure printing b //$NON-NLS-1$
    MultiplyMatrices.print(MultiplyMatrices.multiply(a,b), "a*b");// multiply and print //$NON-NLS-1$
  }
}
