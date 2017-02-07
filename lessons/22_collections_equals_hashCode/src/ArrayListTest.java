import java.util.ArrayList;

/** a test for array list */
public class ArrayListTest {
  /** The main routine 
   *  @param args  we ignore this parameter */
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    
    list.add("Hello"); //$NON-NLS-1$
    list.add("World."); //$NON-NLS-1$
    list.add("It's"); //$NON-NLS-1$
    list.add("me."); //$NON-NLS-1$
    System.out.println(list); // [Hello, World., It's, me.]
    
    int index = list.indexOf("World."); //$NON-NLS-1$
    System.out.println(index); // 1
    
    list.remove(index);
    System.out.println(list); // [Hello, It's, me.]
    
    list.add(index, "World!!!"); //$NON-NLS-1$
    System.out.println(list); // [Hello, World!!!, It's, me]
    
    for(String string : list) { // fast read-only iteration
      System.out.print(string); // HelloWorld!!!It'sme.
    }
    System.out.println();

    ArrayList<String> list2 = new ArrayList<>();
    list2.addAll(list);
    list2.remove(1);
    System.out.println(list2); // [Hello, It's, me.]
    
    list.removeAll(list2);
    System.out.println(list); // [World!!!]    
    
    list.addAll(list2);
    list.addAll(list);
    System.out.println(list); // [World!!!, Hello, It's, me., World!!!, Hello, It's, me.]
  }
}
