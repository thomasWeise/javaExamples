import java.util.ArrayList;

/** Putting primitive types into a list */
public class PrimitiveTypesInListActual {
  /** The main routine 
   *  @param args  we ignore it */
  public static void main(String[] args) { 
    ArrayList<Object> list = new ArrayList<>();
    
    list.add(Integer.valueOf(1));
    list.add(Boolean.valueOf(true));
    list.add(Double.valueOf(2.5d));
    list.add(Float.valueOf(9f));
    list.add(Character.valueOf('x'));
    System.out.println(list); // prints [1, true, 2.5, 9.0, x]
  }
}
