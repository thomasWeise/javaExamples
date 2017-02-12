/** Putting primitive types into an object array */
public class PrimitiveTypesInArray {
  /** The main routine 
   *  @param args  we ignore it */
  public static void main(String[] args) { 
    Object[] array = {1, true, 2.5d, 9f, 'x'};
    
    for(Object o: array) {
      System.out.println(o);
    } // prints 1\n true\n 2.5\n 9.0\n x
  }
}
