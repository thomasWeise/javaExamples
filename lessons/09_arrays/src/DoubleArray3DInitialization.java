/** Example for initializing multi-dimensional double arrays during construction */
public class DoubleArray3DInitialization {
  /**
   * The main routine
   * 
   * @param args
   *          we ignore this parameter for now
   */
  public static final void main(String[] args) {
    double[][][] array = { { { 0d, 3d }, { 1d, 2d } },
                           { { 0.3d, 0.7d }, { 1.0d, 0.2d, 0.8d }, { 0.6d, 0.4d } } };

    for (double[][] matrix : array) { // iterate first dimension: 2d-arrays
      System.out.println("--- strange matrix ^_^ ---"); //$NON-NLS-1$
      for (double[] row : matrix) { // iterate over second dimension: 1d-arrays, rows
        for (double value : row) { // iterate over values inside row
          System.out.print(' ');
          System.out.print(value);
        }
        System.out.println();
      }
    }
  }
}
