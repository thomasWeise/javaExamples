/** Example for allocating and using a 2d-int arrays and iterating over them */
public class IntArray2DNewIterate {
  /**
   * The main routine
   * 
   * @param args
   *          we ignore this parameter for now
   */
  public static final void main(String[] args) {
    int[][] array = new int[5][3]; // create a 2-d integer array for length 5*3

    for (int i = 0; i < array.length; i++) { // iterating over first dimension
      for (int j = 0; j < array[i].length; j++) { // iterating over second dimension
        array[i][j] = (i * j); // setting element
      }
    }

    // now we want to print the array
    for (int[] row : array) { // fast read-only iteration over "rows", i.e., first dim of 2d
      for (int value : row) { // fast read-only iteration over elements in selected row
        System.out.print(' ');
        System.out.print(value); // print the element value
      }
      System.out.println();
    }
  }
}
