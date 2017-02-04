/** Example for initializing arrays during construction */
public class DoubleArrayInitialization {

  /** The main routine
   * @param args
   *          we ignore this parameter for now */
  public static final void main(String[] args) {
    double[] array = { 0.3d, 0.7d, 1.0d, 0.2d, 0.8d, 0.6d, 0.4d }; // initialize array

    double sum = 0d; // set sum to 0

    for (double value : array) { // iterate over array
      sum += value; // add each element
    }

    System.out.println(sum);// prints 4, the sum of all 7 array elements
  }
}
