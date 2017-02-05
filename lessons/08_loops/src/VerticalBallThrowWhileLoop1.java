/**
 * A ball is thrown vertically upwards into the air by a 1.8m tall person<br/>
 * with velocity 10m/s. Where is it after `t=0, 0.2, \dots, 2.2` seconds?<br/>
 * `x(t) = x_0 + v_0*t - 0.5*g*t^2`
 */
public class VerticalBallThrowWhileLoop1 {

  /** The main routine
   * @param args
   *          we ignore this parameter for now */
  public static final void main(String[] args) {
    double x0 = 1.8d; // initial vertical position
    double v0 = 10d; // initial velocity upwards
    double g = 9.80665d; // free fall acceleration downwards

    int i = 0;
    while (i < 12) { // the condition is checked at the top of the loop
      double t = 0.2d * i;
      System.out.println(x0 + (v0 * t) - 0.5d * g * t * t); // prints the current position
      i++; // increase counter
    }
  }
}
