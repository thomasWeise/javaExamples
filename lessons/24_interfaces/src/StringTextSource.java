/** a string-based text source */
public class StringTextSource implements TextSource {
  /** the string */
  String string;
  /** the current index */
  int index;

  /** create the text source */
  StringTextSource(final String _string) {
    this.string = _string; // store the string, index will be 0
  }

  /** read a character */
  @Override
  public int readChar() {
    if (this.index < this.string.length()) {   // if we did not reach end of string,
      return this.string.charAt(this.index++); // return character at index, then increase index
    }
    return -1;                                 // we have reached end: return -1
  }
  
  /** The main routine
   * @param args
   *          we ignore this parameter for now */
  public static final void main(String[] args) {
    
    TextSource source = new StringTextSource(// create text source with 3 non-white-space lines of text as 1 string
                  "Hello World!\n  It is me!\n \r\nYour friendly teacher!"); //$NON-NLS-1$
    
    String current;    
    while ((current = source.readLine()) != null) { // as long as we did not yet reach the end
      System.out.println(current);                  // print the current string
    }
  }
}
