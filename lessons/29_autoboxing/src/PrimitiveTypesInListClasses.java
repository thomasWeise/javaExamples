import java.util.ArrayList;

/** Putting primitive types into a list */
public class PrimitiveTypesInListClasses {
  /** The main routine 
   *  @param args  we ignore it */
  public static void main(String[] args) { 
    ArrayList<Object> list = new ArrayList<>();
    
    list.add(1);
    list.add(true);
    list.add(2.5d);
    list.add(9f);
    list.add('x');
    for(Object o: list) {
      System.out.println(o.getClass());
    } // prints class java.lang.Integer\n class java.lang.Boolean 
 // class java.lang.Double \n class java.lang.Float  \n class java.lang.Character
  }
}
