import java.util.Scanner;

/**
 * A ball is thrown vertically upwards into the air by a $x_0m$ tall person<br/>
 * with velocity $v_0m/s$. Where is it after $t$ seconds?<br/>
 * $x(t) = x_0 + v_0*t - 0.5 * g * t^2$<br/>
 * Allow user to enter arbitrarily many values for t
 */
public class VerticalBallThrowWhileLoopSystemIn {
  /**
   * The main routine
   * 
   * @param args
   *          we ignore this parameter for now
   */
  public static final void main(String[] args) {
    double x0 = 1.8d; // initial vertical position
    double v0 = 10d; // initial velocity upwards
    double g = 9.80665d; // free fall acceleration downwards

    Scanner scanner = new Scanner(System.in); // initiate reading from System.in, ignore for now

    System.err.println("Keep entering times t, hit ctrl-d to exit."); //$NON-NLS-1$
    while (scanner.hasNext()) { // until stdin was closed with ctrl-d (or end has been reached)
      double t = scanner.nextDouble(); // read next number from stdin
      System.out.print("position at x("); //$NON-NLS-1$
      System.out.print(t); // print t
      System.out.print(")="); //$NON-NLS-1$
      double xt = x0 + (v0 * t) - 0.5d * g * t * t; // $x(t) = x_0 + v_0*t - 0.5*g*t^2$
      System.out.println((xt > 0d) ? xt : 0d); // prints result and makes sure the ball stops at ground
    }
  }
}
