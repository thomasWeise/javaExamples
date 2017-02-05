/** testing the complex number calculator */
public class ComplexNumberTest {

  /**
   * The main routine
   * 
   * @param args
   *          we ignore this parameter
   */
  public static final void main(String[] args) {
    ComplexNumber a, b, res;

    ComplexNumberCalculator.println(// print the result of...
        a = new ComplexNumber(20d)); //... the construction of a real-valued complex number
    ComplexNumberCalculator.println(// print the result of...
        b = new ComplexNumber(1d, -2d)); //...the construction of a complex number of value `1-2i`

    ComplexNumberCalculator.println(// print the result of `(20*(1-2i))-(1-2i) = 19*(1-2i) = 19-38i`
        res = ComplexNumberCalculator.subtract(ComplexNumberCalculator.multiply(a, b), b));

    ComplexNumberCalculator.println(// print the result of `\frac{19-38i}{1-2i} = 19 = 19-0i`
        ComplexNumberCalculator.divide(res, b));

    ComplexNumberCalculator.println(// print the result of
        ComplexNumberCalculator.divide(// `\frac{(19-38i)*(19-38i)}{(19-38i)*(1-i)} = \frac{19-38i}{1-i}`
            ComplexNumberCalculator.multiply(res, res), // = `28.5-9.5i`
            ComplexNumberCalculator.multiply(res, new ComplexNumber(1d, -1d)))); // using new in expression
  }
}
