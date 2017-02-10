/** a string function just rendering each string as upper case */
public class UpperCase implements StringFunction {
  /** convert a string to upper case */
  @Override
  public final String compute(String in) {
    return in.toUpperCase(); // convert String in to upper case: "a" -> "A"
  }
  
  /** The main routine
   * @param args
   *          we ignore this parameter for now */
  public static final void main(String[] args) {
    StringFunction.mapAndPrint(new String[] { // allocate text, apply function
        "Hello", "World!", "It's",  //$NON-NLS-1$//$NON-NLS-2$//$NON-NLS-3$ 
        "me,",  "your", "good",     //$NON-NLS-1$//$NON-NLS-2$//$NON-NLS-3$ 
        "old", "teacher."           //$NON-NLS-1$//$NON-NLS-2$
    }, new UpperCase()); // HELLO WORLD! IT'S ME, YOUR GOOD OLD TEACHER.
  }
}
