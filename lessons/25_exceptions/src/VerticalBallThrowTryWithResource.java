import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A ball is thrown vertically upwards into the air by a `x_0m` tall person
 * with velocity `v_0m/s`. Where is it after `t` seconds? `x(t) = x_0 + v_0*t - 0.5 * g * t^2`
 * Applying try-with-resource to close the scanner
 */
public class VerticalBallThrowTryWithResource {

  /** The main routine
   * @param args
   *          we ignore this parameter for now */
  public static final void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {//Scanner is resource, implements java.io.Closeable
      System.err.println("Enter size x0 of personin m:"); //$NON-NLS-1$
      double x0 = scanner.nextDouble();        // read initial vertical position `x_0`
      System.err.println("Enter initial upward velocity v0 of ball in m/s:"); //$NON-NLS-1$
      double v0 = scanner.nextDouble();        // read initial velocity upwards `v_0`
      double g = 9.80665d;                     // free fall acceleration downwards
      System.err.println("Enter time t in s:");//$NON-NLS-1$
      double t = scanner.nextDouble();         // read the time $t$
      double xt = x0 + (v0*t) - 0.5d*g*t*t;    // `x(t) = x_0 + v_0*t - 0.5*g*t^2`
      System.out.println((xt > 0d) ? xt : 0d); // prints result, makes sure the ball stops at ground
    } // scanner.close is automatically invoked when the code reaches this point
  }
}
