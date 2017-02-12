package cn.edu.hfuu.iao_fix1; // <-- package name changed for demo purposes

import java.util.Scanner;

/**
 * A ball is thrown vertically upwards into the air by a `x_0m` tall person
 * with velocity `v_0m/s`. Where is it after `t` seconds?<br/>
 * `x(t) = x_0 + v_0*t - 0.5 * g * t^2`
 */
public class VerticalBallThrow {

  /** Compute the position of a ball, preventing it from falling through earth
   * @param x0 the height of the thrower, i.e., the initial vertical position
   * @param v0 the vertical upward velocity with which the ball is thrown
   * @param t the time at which we want to get the position `x(t)`
   * @return the position `x(t)` of the ball at time step t
   */
  static double position(double x0, double v0, double t) {
    final double result = x0 + (v0 * t) - 0.5d * 9.80665d * t * t;
    return (result > 0d) ? result : 0d;
  }
  
  /** The main routine
   * @param args
   *          we ignore this parameter for now */
  public static final void main(String[] args) {
    try(Scanner scanner = new Scanner(System.in)) { // initiate reading from System.in, ignore for now
      System.err.println("Enter size x0 of personin m:"); //$NON-NLS-1$
      double x0 = scanner.nextDouble(); // read initial vertical position `x_0`
      System.err.println("Enter initial upward velocity v0 of ball in m/s:"); //$NON-NLS-1$
      double v0 = scanner.nextDouble(); // read initial velocity upwards `v_0`
      System.err.println("Enter time t in s:"); //$NON-NLS-1$
      double t = scanner.nextDouble();  // read the time $t$
      System.out.println(position(x0, v0, t)); // compute and print position
    }
  }
}
