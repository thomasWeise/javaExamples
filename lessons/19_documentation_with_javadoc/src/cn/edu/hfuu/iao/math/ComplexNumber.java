package cn.edu.hfuu.iao.math;

/** a class representing a complex number `z\in\mathbb{C}`in rectangular form `z=\alpha+\beta i`, now also implementing the math routines */
public final class ComplexNumber {
  /** the real part `\alpha` of the complex number */
  private final double realPart;
  /** the imaginary part `\beta` */
  private final double imaginaryPart; 

  /** create a new complex number setting both real and imaginary part
   * @param _realPart the real part
   * @param _imaginaryPart the imaginary part */
  public ComplexNumber(final double _realPart, final double _imaginaryPart) {
    this.realPart = _realPart;
    this.imaginaryPart = _imaginaryPart;
  }

  /** return new complex number with result {@code this + x}
   * @param x the complex number to add
   * @return a new complex number with the result of the addition */
  public final ComplexNumber add(final ComplexNumber x) {
    return new ComplexNumber((this.realPart + x.realPart), (this.imaginaryPart + x.imaginaryPart)); // `(\alpha_x+\alpha_y)\;+\;(\beta_x+\beta_y)i`
  }

  /** return new complex number with result {@code this - x}
   * @param x the number to subtract
   * @return the result of the subtraction of {@code this - x} in a new complex number */
  public final ComplexNumber subtract(final ComplexNumber x) {
    return new ComplexNumber((this.realPart - x.realPart), (this.imaginaryPart - x.imaginaryPart)); // `(\alpha_x-\alpha_y)\;+\;(\beta_x-\beta_y)i`
  }

  /** return new complex number with result {@code this*x}
   * @param x the number to multiply with
   * @return the result of the multiplication of {@code this*x} in a new complex number */
  public final ComplexNumber multiply(final ComplexNumber x) {
    double a1 = this.realPart, b1 = this.imaginaryPart, a2 = x.realPart, b2 = x.imaginaryPart;
    return new ComplexNumber(((a1 * a2) - (b1 * b2)), ((a1 * b2) + (b1 * a2))); // `(\alpha_x\alpha_y-\beta_x\beta_y)\;+\;(\alpha_x\beta_y+\beta_x\alpha_y)i`
  }

  /** return new complex number with {@code this/x}
   * @param x the number to divide by
   * @return the result of the division of {@code this/x} in a new complex number */
  public ComplexNumber divide(final ComplexNumber x) {
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
