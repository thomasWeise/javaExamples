/** a calculator for complex numbers in `\mathbb{C}` */
public class ComplexNumberCalculator {

  /** add two complex numbers, return new complex number with result `(\alpha_x+\alpha_y)\;+\;(\beta_x+\beta_y)i` */
  static ComplexNumber add(ComplexNumber x, ComplexNumber y) {
    return new ComplexNumber((x.realPart + y.realPart), (x.imaginaryPart + y.imaginaryPart));
  }

  /** subtract two complex numbers (x-y), return new complex number with result `(\alpha_x-\alpha_y)\;+\;(\beta_x-\beta_y)i` */
  static ComplexNumber subtract(ComplexNumber x, ComplexNumber y) {
    return new ComplexNumber(//
        (x.realPart - y.realPart), //
        (x.imaginaryPart - y.imaginaryPart));
  }

  /** multiply two complex numbers (x*y), return new complex number with result `(\alpha_x\alpha_y-\beta_x\beta_y)\;+\;(\alpha_x\beta_y+\beta_x\alpha_y)i` */
  static ComplexNumber multiply(ComplexNumber x, ComplexNumber y) {
    double a1 = x.realPart, b1 = x.imaginaryPart;
    double a2 = y.realPart, b2 = y.imaginaryPart;

    return new ComplexNumber(((a1 * a2) - (b1 * b2)), //
        ((a1 * b2) + (b1 * a2)));
  }

  /** divide two complex numbers (x/y), return new complex number with result `\frac{\alpha_x\alpha_y + \beta_x\beta_y}{\alpha_y^2 + \beta_y^2} + \frac{\alpha_y\beta_x - \beta_y\alpha_x}{\alpha_y^2 + \beta_y^2}i` */
  static ComplexNumber divide(ComplexNumber x, ComplexNumber y) {
    double a1 = x.realPart, b1 = x.imaginaryPart;
    double a2 = y.realPart, b2 = y.imaginaryPart;

    return new ComplexNumber((((a1 * a2) + (b1 * b2)) / ((a2 * a2) + (b2 * b2))), //
        (((a2 * b1) - (b2 * a1)) / ((a2 * a2) + (b2 * b2))));
  }

  /** print a complex number to stdout */
  static void println(ComplexNumber x) {
    System.out.print(x.realPart);
    System.out.print(" + "); //$NON-NLS-1$
    System.out.print(x.imaginaryPart);
    System.out.println('i');
  }
}
