/** An example program using the methods of java.lang.Math */
public class MathMethodsAndConstants {

  /**
   * The main routine
   * 
   * @param args
   *          we ignore this parameter
   */
  public static final void main(String[] args) {
    System.out.println(Math.log(Math.E));
    System.out.println(Math.sin(Math.PI / 2d));
    
    // ok, the one below is not from Math but from our class
    // VerticalBallThrowFunctionAndConstants
    System.out.println(VerticalBallThrowFunctionAndConstants.G);
  }
}
