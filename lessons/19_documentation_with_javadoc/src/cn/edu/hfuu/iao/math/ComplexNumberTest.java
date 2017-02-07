package cn.edu.hfuu.iao.math;

/** testing the new complex number class: almost the same as in last lesson, just with instance methods and toString */
public class ComplexNumberTest {

  /** The main routine
   *  @param args
   *          we ignore this parameter */
  public static final void main(String[] args) {
    ComplexNumber a, b, res;

    a = new ComplexNumber(20d, 0d); // instantiate `a=20+0i`
    a.println(); // print `20+0i`

    b = new ComplexNumber(1d, -2d); // create `b=1-2i`
    b.println(); // print `1+2i`

    (res = a.multiply(b)).println(); // set `res=a*b=20*(1-2i)=20-40i` and print

    res = a.multiply(b).subtract(b); // we can chain methods by applying subtract to the result of multiply
    res.println(); // print the result of the above computation: `(20*(1-2i))-(1-2i) = 19*(1-2i) = 19-38i`

    res.divide(b).println();// print the result of `\frac{19-38i}{1-2i} = 19 = 19+0i`, but don't store it:
                            // created object becomes immediately subject to GC (same as a.multiply(b) above)

    res.multiply(res).divide(res.multiply(// `\frac{(19-38i)*(19-38i)}{(19-38i)*(1-i)} = 28.5-9.5i`
        new ComplexNumber(1d, -1d))).println();
  }
}
