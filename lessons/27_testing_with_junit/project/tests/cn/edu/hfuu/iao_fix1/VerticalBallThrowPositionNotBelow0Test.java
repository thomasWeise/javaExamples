package cn.edu.hfuu.iao_fix1; // <-- package name changed for demo purposes

import org.junit.Assert;
import org.junit.Test;

/** Our second test class: the ball cannot fall below `0m` */
public class VerticalBallThrowPositionNotBelow0Test {

  /** test the position for `x_0=1m`, `v_0=10m/s^2`, `t=1000s` */
  @Test // the annotation @Test means that this method is a test case
  public void testPosition_not_below_0_x01_v010_t1000() {
    Assert.assertEquals(0d,                         // the expected value
        VerticalBallThrow.position(1d, 10d, 1000d), // the actual result
        1e-10d); // == comparisons are a no-no for floating point, 1e-10d is the allowed deviation
  }  
}
