import java.util.ArrayList;
import java.util.Iterator;

/** we use ArrayList and test the syntactical sugar; equivalent to IteatorTest */
public class IterableTest {
    
  /** The main routine
   * @param args
   *          we ignore this parameter for now */
  public static final void main(String[] args) {    
    ArrayList<String> list = new ArrayList<>();
    
    list.add("Hello"); list.add("World!");   //$NON-NLS-1$//$NON-NLS-2$
    list.add("It's");  list.add("me");       //$NON-NLS-1$//$NON-NLS-2$
    list.add("your");  list.add("teacher."); //$NON-NLS-1$//$NON-NLS-2$

    // this creates an iterator by using list.iterator, and then iterates
    for(String string : list) { // over the list, storing the elements in string
      System.out.print(string); // one by one, and here we print them
      System.out.print(' ');
    } // Hello World! It's me your teacher.
  }
}
