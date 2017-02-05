/** a class representing a complex number `z\in\mathbb{C}`in rectangular form `z=\alpha+\beta i` */
public class ComplexNumber {

  double realPart; // the real part `\alpha` of the complex number
  double imaginaryPart; // the imaginary part `\beta`

  /** create a new complex number, sets real and imaginary part to 0d */
  public ComplexNumber() {
  }
  
  /** create a new complex number setting the real part, leaving imaginary part 0 */
  public ComplexNumber(final double _realPart) {
    this(); // optional: first invoke the parameterless first constructor
    this.realPart = _realPart;
  }

  /** create a new complex number setting both real and imaginary part */
  public ComplexNumber(final double _realPart, final double _imaginaryPart) {
    this(_realPart); // first invoke the one-parameter constructor setting real part
    this.imaginaryPart = _imaginaryPart;
  }
}
