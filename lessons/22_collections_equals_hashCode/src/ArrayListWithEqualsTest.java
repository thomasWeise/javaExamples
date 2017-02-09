import java.util.ArrayList;

/** a test for search methods in array list */
public class ArrayListWithEqualsTest {
  /** The main routine 
   *  @param args  we ignore this parameter */
  public static void main(String[] args) {
    ArrayList<IntHolderWithEquals> list = new ArrayList<>();
        
    list.add(new IntHolderWithEquals(3));    
    IntHolderWithEquals ih4 = new IntHolderWithEquals(4);
    list.add(ih4);
    list.add(new IntHolderWithEquals(-1));
    list.add(new IntHolderWithEquals(3));
    System.out.println(list); // [3, 4, -1, 3]
    
    System.out.println(list.contains(new IntHolderWithEquals(3)));    // true
    System.out.println(list.contains(new IntHolderWithEquals(4)));    // true
    System.out.println(list.contains(ih4));                           // true
    System.out.println(list.contains(new IntHolderWithEquals(5)));    // false
    
    System.out.println(list.indexOf(new IntHolderWithEquals(3)));     // 0
    System.out.println(list.indexOf(new IntHolderWithEquals(4)));     // 1
    System.out.println(list.indexOf(ih4));                            // 1  (found)
    System.out.println(list.indexOf(new IntHolderWithEquals(5)));     // -1 (not found)
    
    System.out.println(list.lastIndexOf(new IntHolderWithEquals(3))); // 3
    System.out.println(list.lastIndexOf(new IntHolderWithEquals(4))); // 1
    System.out.println(list.lastIndexOf(ih4));                        // 1  (found)
    System.out.println(list.lastIndexOf(new IntHolderWithEquals(5))); // -1 (not found)
  }
}
