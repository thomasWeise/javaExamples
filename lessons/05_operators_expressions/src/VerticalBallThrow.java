/**
 * A ball is thrown vertically upwards into the air by a 1.8m tall person
 * with velocity 10m/s. Where is it after t=1.5 seconds?<br/>
 * `x(t) = x_0 + v_0*t - 0.5 * g * t^2`
 */
public class VerticalBallThrow {

  /** The main routine
   * @param args
   *          we ignore this parameter for now */
  public static final void main(String[] args) {
    double x0 = 1.8d; // initial vertical position
    double v0 = 10d; // initial velocity upwards
    double g = 9.80665d; // free fall acceleration downwards
    double t = 1.5d; // the time
    double xt = x0 + (v0*t) - 0.5d*g*t*t; // `x(t) = x_0 + v_0*t - 0.5*g*t^2`
    System.out.println(xt); // prints 5.767518750000001
  }
}
