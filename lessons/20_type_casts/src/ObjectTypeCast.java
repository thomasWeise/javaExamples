/** Type casting object values. */
public class ObjectTypeCast {

  /** The main routine
   * @param args
   *          we ignore this parameter for now */
  public static final void main(String[] args) {
    
    String string = "Hello World!"; //$NON-NLS-1$
    System.out.println(string);     // print "Hello World!"
    Object object = string;         // object now points to a String
    System.out.println(object);     // print "Hello World!"
    
    if(object instanceof String) {  // is object pointing to a String?
      string = (String) object;     // yes, so we can type cast
      System.out.println(string);   // print "Hello World!"
    }
    
    object = new ObjectTypeCast();  // now object is definitely not a String
    if(object instanceof String) {  // is object pointing to a String?
      string = (String) object;     // no, we never get here
    }
  }
}
