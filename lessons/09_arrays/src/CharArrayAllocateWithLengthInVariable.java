/** Example for allocating an array of a length stored in a variable and 
 *  iterating over a character array */
public class CharArrayAllocateWithLengthInVariable {

  /** The main routine
   * @param args
   *          we ignore this parameter for now */
  public static final void main(String[] args) {
    int neededLength = 'Z' - 'A' + 1; // yes, this is allowed, as characters are internally numbers
    char[] AtoZ; // notice how we declare the array here, but actually allocate it later: we can do that!    
    AtoZ = new char[neededLength]; // allocate array: length specified in variable
    char letter = 'A'; // set letter to 'A'

    for (int i = 0; i < neededLength; i++) { // iterate from 0 to neededLength-1
      AtoZ[i] = letter++; // store letter in array, then move on to next letter
    }

    for (int i = 0; i < neededLength; i++) { // iterate from 0 to neededLength-1
      System.out.print(AtoZ[i]); // print the array element at index i
    }
  }
}
