import java.util.ArrayList;

/** a class implementing two interfaces, StringFunction and Addable<StringFunction>, on top of class ArrayList */
public class ConcatenatedFunction extends ArrayList<StringFunction> implements StringFunction, Addable<StringFunction> {
  /** the serial version uid, do not worry about this, just ignore it  */
  private static final long serialVersionUID = 1L;
  
  /** convert a string by applying all functions one by one */
  @Override
  public final String compute(String in) {
    String current = in;                   // start at the current string `c`
    for(StringFunction function : this) {  // for each function `f` in this ArrayList
      current = function.compute(current); // set `c \longleftarrow f(c)`
    }
    return current;                        // return the resulting string
  }

  /** implement addAtEnd from interface Addable */
  @Override
  public void addAtEnd(StringFunction value) {
    this.add(value); // add value to the list of functions to carry out
  }
  
  /** The main routine
   * @param args
   *          we ignore this parameter for now */
  public static final void main(String[] args) {    
    MapFunction map = new MapFunction();  // create a MapFunction
    map.put("teacher.", "Prof. Weise.");  // replace "teacher." with "Prof. Weise"  //$NON-NLS-1$//$NON-NLS-2$
    map.put("me,",      "your teacher,"); // replace "me,"      with "your teacher" //$NON-NLS-1$//$NON-NLS-2$
    
    ConcatenatedFunction func = new ConcatenatedFunction(); // create a concatenated function
    func.addAtEnd(map);                                     // tell it to first perform the map function
    func.addAtEnd(new UpperCase());                         // and then to convert the result to upper case    

    StringFunction.mapAndPrint(new String[] { // allocate an array containing 8 strings and appy the function to them
        "Hello", "World!", "It's",  //$NON-NLS-1$//$NON-NLS-2$//$NON-NLS-3$ 
        "me,",  "your", "good",     //$NON-NLS-1$//$NON-NLS-2$//$NON-NLS-3$ 
        "old", "teacher."           //$NON-NLS-1$//$NON-NLS-2$
    }, func); // HELLO WORLD! IT'S YOUR TEACHER, YOUR GOOD OLD PROF. WEISE. 
  }
}
