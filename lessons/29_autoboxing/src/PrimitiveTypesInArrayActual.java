/** Putting primitive types into an object array */
public class PrimitiveTypesInArrayActual {
  /** The main routine 
   *  @param args  we ignore it */
  public static void main(String[] args) { 
    Object[] array = {Integer.valueOf(1), Boolean.valueOf(true),
                      Double.valueOf(2.5d), Float.valueOf(9f),
                      Character.valueOf('x')};
    
    for(Object o: array) {
      System.out.println(o);
    } // prints 1\n true\n 2.5\n 9.0\n x
  }
}
