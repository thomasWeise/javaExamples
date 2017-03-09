/** An example program printing and multiplying matrices.  */
public class MultiplyMatrices {

  static void print(double[][] matrix, String name) {
    System.out.println("Matrix " + name + ':'); //$NON-NLS-1$
    for (double[] row : matrix) {// fast read-only iteration over matrix rows
      for (double value : row) { // fast read-only iteration of values in row
        System.out.print(' ');
        System.out.print(value);
      }
      System.out.println();
    }
  }

  static double[][] multiply(double[][] a, double[][] b) {
    int aColumns = a[0].length;
    int bColumns = b[0].length;

    double[][] result = new double[a.length][bColumns]; //allocate and initialize all values to 0 

    for (int i = 0; i < a.length; i++) { // iterate over the rows of a
      for (int j = 0; j < bColumns; j++) { // iterate over the columns of b
        for (int k = 0; k < aColumns; k++) { // iterate over the columns of A
          result[i][j] += a[i][k] * b[k][j];
        }
      }
    }

    return result; // return result
  }

  /** The main routine
   * @param args
   *          we ignore this parameter */
  public static final void main(String[] args) {
    double[][] a = { { 4d, 3d }, { 2d, 1d } }; // allocate and initialize first matrix
    double[][] b = { { -0.5d, 1.5d }, { 1d, -2d } }; // allocate and initialize second matrix
    
    print(a, "a");// call a procedure printing a //$NON-NLS-1$
    print(b, "b");// call a procedure printing b //$NON-NLS-1$
    print(multiply(a,b), "a*b");// call a procedure printing the result of the multiplication //$NON-NLS-1$
  }
}
