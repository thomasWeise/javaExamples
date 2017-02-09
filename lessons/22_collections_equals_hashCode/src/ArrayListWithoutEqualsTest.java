import java.util.ArrayList;

/** a test for search methods in array list */
public class ArrayListWithoutEqualsTest {
  /** The main routine 
   *  @param args  we ignore this parameter */
  public static void main(String[] args) {
    ArrayList<IntHolder> list = new ArrayList<>();
        
    list.add(new IntHolder(3));    
    IntHolder ih4 = new IntHolder(4);
    list.add(ih4);
    list.add(new IntHolder(-1));
    list.add(new IntHolder(3));
    System.out.println(list); // [3, 4, -1, 3]
    
    System.out.println(list.contains(new IntHolder(3)));    // false 
    System.out.println(list.contains(new IntHolder(4)));    // false
    System.out.println(list.contains(ih4));                 // true
    System.out.println(list.contains(new IntHolder(5)));    // false
    
    System.out.println(list.indexOf(new IntHolder(3)));     // -1 (not found)
    System.out.println(list.indexOf(new IntHolder(4)));     // -1 (not found)
    System.out.println(list.indexOf(ih4));                  // 1  (found)
    System.out.println(list.indexOf(new IntHolder(5)));     // -1 (not found)
    
    System.out.println(list.lastIndexOf(new IntHolder(3))); // -1 (not found)
    System.out.println(list.lastIndexOf(new IntHolder(4))); // -1 (not found)
    System.out.println(list.lastIndexOf(ih4));              // 1  (found)
    System.out.println(list.lastIndexOf(new IntHolder(5))); // -1 (not found)
  }
}
