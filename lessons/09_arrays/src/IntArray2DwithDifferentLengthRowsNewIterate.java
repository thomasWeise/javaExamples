/** Example for allocating and using 2d-int arrays of different row size and iterating over them */
public class IntArray2DwithDifferentLengthRowsNewIterate {

  /** The main routine
   * @param args
   *          we ignore this parameter for now */
  public static final void main(String[] args) {
    int[][] array;// delare array variable

    array = new int[5][]; // allocate only first dimension!
    for (int i = 0; i < array.length; i++) { // iterating over first dimension
      array[i] = new int[(i + 1) * 2]; // allocate 2d dimensions (rows) of different length
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
