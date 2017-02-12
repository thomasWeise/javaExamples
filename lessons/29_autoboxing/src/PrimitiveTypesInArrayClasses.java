/** Putting primitive types into an object array */
public class PrimitiveTypesInArrayClasses {
  /** The main routine 
   *  @param args  we ignore it */
  public static void main(String[] args) { 
    Object[] array = {1, true, 2.5d, 9f, 'x'};
    
    for(Object o: array) {
      System.out.println(o.getClass());
    } // prints class java.lang.Integer\n class java.lang.Boolean 
// class java.lang.Double \n class java.lang.Float  \n class java.lang.Character
  }
}
