package cn.edu.hfuu.iao;

import java.io.StringReader;
import java.util.Scanner;

import org.apache.commons.math3.stat.regression.SimpleRegression;
import org.junit.Assert;
import org.junit.Test;

/** The unit test for our line-fitting main routine */
public class MainTest {

  /** test whether (0,0) and (1,1) will fit to y=0+x*1 */
  @Test
  public void testFitting0011ResultsIn01() {
    SimpleRegression regression;

    try (final StringReader sr = new StringReader("0 0\n1 1")) {//$NON-NLS-1$
      try (final Scanner scanner = new Scanner(sr)) {
        regression = Main.fitLine(scanner);
      }
    }

    Assert.assertEquals(0d, regression.getIntercept(), 1e-10d);
    Assert.assertEquals(1d, regression.getSlope(), 1e-10d);
  }
}
