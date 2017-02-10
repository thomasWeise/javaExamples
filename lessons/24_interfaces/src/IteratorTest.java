import java.util.ArrayList;
import java.util.Iterator;

/** we use ArrayList and an Iterator on its elements */
public class IteratorTest {
    
  /** The main routine
   * @param args
   *          we ignore this parameter for now */
  public static final void main(String[] args) {    
    ArrayList<String> list = new ArrayList<>();
    
    list.add("Hello"); list.add("World!");   //$NON-NLS-1$//$NON-NLS-2$
    list.add("It's");  list.add("me");       //$NON-NLS-1$//$NON-NLS-2$
    list.add("your");  list.add("teacher."); //$NON-NLS-1$//$NON-NLS-2$
    
 // create the iterator: this method is inherited from Iterable
    Iterator<String> iterator = list.iterator();
    
    while(iterator.hasNext()) { // hasNext returns true = there are more elements
      System.out.print(iterator.next()); // next returns the next element
      System.out.print(' ');
    } // Hello World! It's me your teacher.
  }
}
