/** a class representing a complex number `z\in\mathbb{C}`in rectangular form `z=\alpha+\beta i`, now also implementing the math routines */
public class ComplexNumber {
  double realPart; // the real part `\alpha` of the complex number
  double imaginaryPart; // the imaginary part `\beta`

  /** create a new complex number setting the real part, leaving imaginary part 0 */
  public ComplexNumber(final double _realPart) { this.realPart = _realPart;  }

  /** create a new complex number setting both real and imaginary part */
  public ComplexNumber(final double _realPart, final double _imaginaryPart) {
    this(_realPart); // first invoke the one-parameter constructor setting real part
    this.imaginaryPart = _imaginaryPart;
  }

  /** return new complex number with result {@code this + x} */
  public ComplexNumber add(ComplexNumber x) {
    return new ComplexNumber((this.realPart + x.realPart), (this.imaginaryPart + x.imaginaryPart)); // `(\alpha_x+\alpha_y)\;+\;(\beta_x+\beta_y)i`
  }

  /** return new complex number with result {@code this - x} */
  public ComplexNumber subtract(ComplexNumber x) {
    return new ComplexNumber((this.realPart - x.realPart), (this.imaginaryPart - x.imaginaryPart)); // `(\alpha_x-\alpha_y)\;+\;(\beta_x-\beta_y)i`
  }

  /** return new complex number with result {@code this*x} */
  public ComplexNumber multiply(ComplexNumber x) {
    double a1 = this.realPart, b1 = this.imaginaryPart, a2 = x.realPart, b2 = x.imaginaryPart;
    return new ComplexNumber(((a1 * a2) - (b1 * b2)), ((a1 * b2) + (b1 * a2))); // `(\alpha_x\alpha_y-\beta_x\beta_y)\;+\;(\alpha_x\beta_y+\beta_x\alpha_y)i`
  }

  /** return new complex number with {@code this/x} */
  public ComplexNumber divide(ComplexNumber x) {
    double a1 = this.realPart, b1 = this.imaginaryPart, a2 = x.realPart, b2 = x.imaginaryPart;
    return new ComplexNumber((((a1 * a2) + (b1 * b2)) / ((a2 * a2) + (b2 * b2))), // `\frac{\alpha_x\alpha_y + \beta_x\beta_y}{\alpha_y^2 + \beta_y^2} `
        (((a2 * b1) - (b2 * a1)) / ((a2 * a2) + (b2 * b2)))); // `\frac{\alpha_y\beta_x - \beta_y\alpha_x}{\alpha_y^2 + \beta_y^2}i`
  }

  /** print this complex number */
  public void println() {
    System.out.print(this.realPart);      System.out.print(" + "); //$NON-NLS-1$
    System.out.print(this.imaginaryPart); System.out.println('i');
  }
}
