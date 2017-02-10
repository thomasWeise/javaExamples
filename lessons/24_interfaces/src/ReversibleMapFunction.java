import java.util.HashMap;

/** A map function transforms a string according to a map, able to create an inverse function.
 * This class implements InvertibleStringFunction and thus also implements its super-interface
 * StringFunction. */
public class ReversibleMapFunction extends HashMap<String, String> implements InvertibleStringFunction {
  /** the serial version uid, do not worry about this, just ignore it  */
  private static final long serialVersionUID = 1L;

  /** If a mapping is defined for the string in, return the mapping.
   * Otherwise, return the string in.*/
  @Override
  public final String compute(String in) { // Obtain the mapping for "in" stored in
    String replacement = this.get(in);     // this hash map. If there is one stored, 
    return (replacement != null) ? replacement : in; //return it, otherwise return "in"
  }
  
  /** return the inverse function (notice the more specific return type) */
  @Override
  public ReversibleMapFunction invert() {                        // create an inverse function
    ReversibleMapFunction inverse = new ReversibleMapFunction(); // allocate the object
    for(Entry<String,String> entry : this.entrySet()) {          // iterate over all key-value entries in the map
      inverse.put(entry.getValue(), entry.getKey());             // for each A -> B mapping in this function
    }                                                            //  add a B -> A mapping in the new function
    return inverse;                                              // and return the result
  }
    
  /** The main routine
   * @param args
   *          we ignore this parameter for now */
  public static final void main(String[] args) {
    ReversibleMapFunction map = new ReversibleMapFunction(); // create the reversible map function
    map.put("teacher.", "Prof. Weise.");  // replace "teacher." with "Prof. Weise"  //$NON-NLS-1$//$NON-NLS-2$
    map.put("me,",      "your teacher,"); // replace "me,"      with "your teacher" //$NON-NLS-1$//$NON-NLS-2$
      
    ConcatenatedFunction func = new ConcatenatedFunction(); // create a concatenated function
    func.add(map);          // add function
    func.add(map.invert()); // add inverse function
    
    StringFunction.mapAndPrint(new String[] {//
        "Hello", "World!", "It's",  //$NON-NLS-1$//$NON-NLS-2$//$NON-NLS-3$ 
        "me,",  "your", "good",     //$NON-NLS-1$//$NON-NLS-2$//$NON-NLS-3$ 
        "old", "teacher."           //$NON-NLS-1$//$NON-NLS-2$
    }, func); // Hello World! It's me, your good old teacher. 
  }
}
