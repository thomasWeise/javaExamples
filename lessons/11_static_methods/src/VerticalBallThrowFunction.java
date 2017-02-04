/**
 * A ball is thrown vertically upwards into the air by a 1.8m tall person<br/>
 * with velocity 10m/s. Where is it after t=0, 0.2, ..., 2.2 seconds?<br/>
 * $x(t) = x_0 + v_0*t - 0.5 * g * t^2$
 */
public class VerticalBallThrowFunction {

  /** Compute the position of a ball (good style: these comments document
   *                                              what the method does)
   * @param x0 the height of the thrower, i.e., the initial vertical position
   * @param v0 the vertical upward velocity with which the ball is thrown
   * @param t the time at which we want to get the position x(t)
   * @return the position x(t) of the ball at time step t
   */
  static double position(double x0, double v0, double t) {
    return x0 + (v0 * t) - 0.5d * 9.80665d * t * t;
  }

  /** The main routine
   * @param args
   *          we ignore this parameter */
  public static final void main(String[] args) {
    for (int i = 0; i < 12; i++) { // using an integer for counting
      System.out.println(position(1.8d, 10d, 0.2d * i)); // prints the current position
    }
  }
}
