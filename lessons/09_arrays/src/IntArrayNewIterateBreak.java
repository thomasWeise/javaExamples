/** Example for allocating and using a int arrays and iterating over them */
public class IntArrayNewIterateBreak {
  /**
   * The main routine
   * 
   * @param args
   *          we ignore this parameter for now
   */
  public static final void main(String[] args) {
    int[] array = new int[5]; // create an integer array for length 5

    array[4] = 5; // set fifth element to 5
    array[2] = 3; // set third element to 3
    array[0] = 1; // set first element to 1
    array[1] = 2; // set second element to 2

    for (int in : array) { // iterate over array items
      if (in == 3) { // exit loop here if in == 3
        break;
      }
      System.out.print(in);
    }
  }
}
