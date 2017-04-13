package cn.edu.hfuu.iao;

import org.junit.Assert;
import org.junit.Test;

/** Our first test class */
public class VerticalBallThrowPositionTest {

  /** test the position for `x_0=0m`, `v_0=g=0.90665m/s`, `t?=1s` */
  @Test // the annotation @Test means that this method is a test case
  public void testPosition_x00_v0g_t1() {
    Assert.assertEquals(4.903325d,                     // the expected value
        VerticalBallThrow.position(0d, 9.80665d, 1d), // the actual result
        1e-10d); // == comparisons are a no-no for floating point, 1e-10d is the allowed deviation
  }  

  /** test the position for `x_0=1m`, `v_0=32m/s`, `t?=2s` */
  @Test // the annotation @Test means that this method is a test case
  public void testPosition_x01_v032_t2() {
    Assert.assertEquals(45.3867d,                // the expected value
        VerticalBallThrow.position(1d, 32d, 2d), // the actual result
        1e-10d); // == comparisons are a no-no for floating point, 1e-10d is the allowed deviation
  }  

  /** test the position for `x_0=2m`, `v_0=15m/s`, `t?=3s` */
  @Test // the annotation @Test means that this method is a test case
  public void testPosition_x02_v015_t3() {
    Assert.assertEquals(2.870075d,               // the expected value
        VerticalBallThrow.position(2d, 15d, 3d), // the actual result
        1e-10d); // == comparisons are a no-no for floating point, 1e-10d is the allowed deviation
  }  
}
