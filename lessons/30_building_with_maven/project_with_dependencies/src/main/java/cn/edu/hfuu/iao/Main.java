package cn.edu.hfuu.iao;

import java.util.Scanner;

import org.apache.commons.math3.stat.regression.SimpleRegression; // import class from dependency library

/** The main class of our project: it reads data from stdin and returns a linear function fitting to it */
public class Main {
  
  /** read data from a Scanner, return a SimpleRegression instance with the fitting result */
  static final SimpleRegression fitLine(final Scanner scanner) {
    SimpleRegression regression = new SimpleRegression();  // using commons-math3's simple regression class
    for (;;) {                                           // keep reading double numbers until stdin ends
      if (!(scanner.hasNextDouble())) { break; }         // if there is no double number, stop reading
      double x = scanner.nextDouble();                   // ok, there is one, read it as x coordinate
      if (!(scanner.hasNextDouble())) { break; }         // if there is no double number, stop reading
      double y = scanner.nextDouble();                   // ok, there is one, read it as y coordinate
      regression.addData(x, y);                          // add the new x and y coordinate to the dataset
    }
    return regression;
  }
  
  /** The main routine
   * @param args
   *          we ignore this parameter for now */
  public static final void main(final String[] args) {
    System.err.println("Welcome to the linear curve fitting program."); //$NON-NLS-1$
    System.err.println("Enter point pairs one pair a line, x and y coordinates separated by space or tab."); //$NON-NLS-1$
    System.err.println("Linear curve is fitted when stdin ends or Ctrl-D is pressed."); //$NON-NLS-1$

    SimpleRegression regression;                           // using commons-math3's simple regression class
    try (final Scanner scanner = new Scanner(System.in)) { // using a Scanner in try-with-resource on System.in
      regression = fitLine(scanner);                       // fit the data from the scanner
    }

    System.out.print("y \u2248 ");//$NON-NLS-1$            // print "y is approximately "
    System.out.print(regression.getIntercept());           // print the y coordinate at x=0
    System.out.print(" + x * ");//$NON-NLS-1$              // " + x * "
    System.out.print(regression.getSlope());               // print the slope
    System.out.print(" (root mean square error: ");        // print RMSE: is 0 if data is linear //$NON-NLS-1$
    System.out.print(Math.sqrt(regression.getMeanSquareError()));
    System.out.println(')');
  }
}
