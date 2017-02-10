import java.util.HashMap;

/** A map function transforms a string according to a map. This would not be
 *  possible using an abstract base class, since then we could not extend HashMap */
public class MapFunction extends HashMap<String, String> implements StringFunction {
  /** the serial version uid, do not worry about this, just ignore it  */
  private static final long serialVersionUID = 1L;

  /** If a mapping is defined for the string in, return the mapping.
   * Otherwise, return the string in.*/
  @Override
  public final String compute(String in) { // Obtain the mapping for "in" stored in
    String replacement = this.get(in);     // this hash map. If there is one stored, 
    return (replacement != null) ? replacement : in; //return it, otherwise return "in"
  }
  
  /** The main routine
   * @param args
   *          we ignore this parameter for now */
  public static final void main(String[] args) {
    MapFunction map = new MapFunction();  // create the map function
    map.put("teacher.", "Prof. Weise.");  //$NON-NLS-1$//$NON-NLS-2$
    map.put("me,",      "your teacher,"); //$NON-NLS-1$//$NON-NLS-2$

    StringFunction.mapAndPrint(new String[] {//
        "Hello", "World!", "It's",  //$NON-NLS-1$//$NON-NLS-2$//$NON-NLS-3$ 
        "me,",  "your", "good",     //$NON-NLS-1$//$NON-NLS-2$//$NON-NLS-3$ 
        "old", "teacher."           //$NON-NLS-1$//$NON-NLS-2$
    }, map); // Hello World! It's your teacher, your good old Prof. Weise.
  }
}
