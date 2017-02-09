/** This class shows what happens if cast an object to a wrong class */
public class WrongTypeCast {
  /** The main routine 
   *  @param args  we ignore this parameter */
  public static void main(String[] args) {
    Object o = new Integer(34);
    String s = ((String)o);
    System.out.println(s);
  }
}
