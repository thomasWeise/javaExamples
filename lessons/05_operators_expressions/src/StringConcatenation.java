/** Examples for String concatenation */
public class StringConcatenation {

  /** The main routine
   * @param args
   *          we ignore this parameter for now */
  public static final void main(String[] args) {
    String text; // declare String variable text
    
    text = "Hello World!"; //store Hello World! in text //$NON-NLS-1$
    System.out.println(text); // prints "Hello World!"
    text = text + " It's me!"; //add It's Me! to text //$NON-NLS-1$
    System.out.println(text); // prints "Hello World! It's me!"
    text = "The result of 5+6 is " + (5+6); // concatenate (5+6) as string to string //$NON-NLS-1$
    System.out.println(text); // prints "The result of 5+6 is 11"
    text = "The result of 5+6 is " + 5 + 6; // concatenate 5 to string then 6 string //$NON-NLS-1$
    System.out.println(text); // prints "The result of 5+6 is 56" <- careful with concatenation, use ()
  }
}
