import java.util.ArrayList;

/** Putting primitive types into a list */
public class PrimitiveTypesInList {
  /** The main routine 
   *  @param args  we ignore it */
  public static void main(String[] args) { 
    ArrayList<Object> list = new ArrayList<>();
    
    list.add(1);
    list.add(true);
    list.add(2.5d);
    list.add(9f);
    list.add('x');
    System.out.println(list); // prints [1, true, 2.5, 9.0, x]
  }
}
