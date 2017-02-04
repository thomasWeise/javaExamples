/**
 * A ball is thrown vertically upwards into the air by a 1.8m tall person<br/>
 * with velocity 10m/s. Where is it after t=0, 0.2, ..., 2.2 seconds?<br/>
 * $x(t) = x_0 + v_0*t - 0.5 * g * t^2$
 */
public class VerticalBallThrowMultiple {

  /** The main routine
   * @param args
   *          we ignore this parameter for now */
  public static final void main(String[] args) {
    double x0 = 1.8d; // initial vertical position
    double v0 = 10d; // initial velocity upwards
    double g = 9.80665d; // free fall acceleration downwards

    double t = 0.0d; // set the time to 0s
    System.out.println(x0 + (v0 * t) - 0.5d * g * t * t); // prints 1.8
    t = 0.2d; // set the time to 0.2s
    System.out.println(x0 + (v0 * t) - 0.5d * g * t * t); // prints 3.6038669999999997
    t = 0.4d; // set the time to 0.4s
    System.out.println(x0 + (v0 * t) - 0.5d * g * t * t); // prints 5.015468
    t = 0.6d; // set the time to 0.6s
    System.out.println(x0 + (v0 * t) - 0.5d * g * t * t); // prints 6.034803
    t = 0.8d; // set the time to 0.8s
    System.out.println(x0 + (v0 * t) - 0.5d * g * t * t); // prints 6.661872000000001
    t = 1.0d; // set the time to 1.0s
    System.out.println(x0 + (v0 * t) - 0.5d * g * t * t); // prints 6.896675000000001
    t = 1.2d; // set the time to 1.2s
    System.out.println(x0 + (v0 * t) - 0.5d * g * t * t); // prints 6.739212000000001
    t = 1.4d; // set the time to 1.4s
    System.out.println(x0 + (v0 * t) - 0.5d * g * t * t); // prints 6.189483000000003
    t = 1.6d; // set the time to 1.6s
    System.out.println(x0 + (v0 * t) - 0.5d * g * t * t); // prints 5.247488000000001
    t = 1.8d; // set the time to 1.8s
    System.out.println(x0 + (v0 * t) - 0.5d * g * t * t); // prints 3.913227000000001
    t = 2.0d; // set the time to 2.0s
    System.out.println(x0 + (v0 * t) - 0.5d * g * t * t); // prints 2.186700000000002
    t = 2.2d; // set the time to 2.2s
    System.out.println(x0 + (v0 * t) - 0.5d * g * t * t); // prints 0.06790699999999816
  }
}
