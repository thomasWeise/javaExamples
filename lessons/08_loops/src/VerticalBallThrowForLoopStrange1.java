/**
 * A ball is thrown vertically upwards into the air by a 1.8m tall person<br/>
 * with velocity 10m/s. Where is it after t=0, 0.2, ..., 2.2 seconds?<br/>
 * $x(t) = x_0 + v_0*t - 0.5 * g * t^2$
 */
public class VerticalBallThrowForLoopStrange1 {

  /** The main routine
   * @param args
   *          we ignore this parameter for now */
  public static final void main(String[] args) {
    double x0 = 1.8d; // initial vertical position
    double v0 = 10d; // initial velocity upwards
    double g = 9.80665d; // free fall acceleration downwards

    for (int i = 0;;) { // using an integer for counting, but no loop condition
      double t = 0.2d * i; // and multiplying it by 0.2 is more accurate
      System.out.println(x0 + (v0 * t) - 0.5d * g * t * t); // prints the current position
      if (++i >= 12) { // the actual loop condition
        break; // exit the for loop if above condition is met
      }
    }
  }
}
