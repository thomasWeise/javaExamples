package cn.edu.hfuu.iao_fix1;

import org.junit.Test;

/** Expect Exceptions if Parameters are Illegal */
public class VerticalBallThrowPositionInvalidInputTest {

  /** test the position for `x_0<0m` */
  @Test(expected = IllegalArgumentException.class) // this method is expected 
  public void testPosition_x0_below_0() {          // to throw an IllegalArgumentException
    VerticalBallThrow.position(-0.1d, 10d, 1000d);
  }  

  /** test the position for `v_0<0m/s` */
  @Test(expected = IllegalArgumentException.class) // this method is expected 
  public void testPosition_v0_below_0() {          // to throw an IllegalArgumentException
    VerticalBallThrow.position(1d, -10d, 1000d);
  }

  /** test the position for `t<0s` */
  @Test(expected = IllegalArgumentException.class) // this method is expected 
  public void testPosition_t_below_0() {           // to throw an IllegalArgumentException
    VerticalBallThrow.position(1d, 10d, -1d);
  }  
  
  /** test the position for parameters that will surely overflow */
  @Test(expected = ArithmeticException.class) // this method is expected 
  public void testPosition_overflow() {       // to throw an ArithmeticException
    VerticalBallThrow.position(Double.MAX_VALUE, Double.MAX_VALUE, 100d);
  }  
}
