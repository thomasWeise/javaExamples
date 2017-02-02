/** Examples for floating point arithmetic */
public class FloatingPointArithmetic {
  /**
   * The main routine
   * 
   * @param args
   *          we ignore this parameter for now
   */
  public static final void main(String[] args) {
    double res1, res2; // declare double variable res1 and res2
    
    res1 = 5d + 4.1d; // store 5 + 4.1 in variable "res1"
    System.out.println(res1); // prints 9.1
    res1 = res1 + 4.1d; // store res1 + 4.1d in variable "res1"
    System.out.println(res1); // prints 13.2
    res1 = res1 + 4.1d; // store res1 + 4.1d in variable "res1"
    System.out.println(res1); // prints 17.299999999999997: double precision is limited (ca. 15 decimals)!
    
    res2 = 171d / res1; // divide 171 by "res1" (which is almost but not exactly 17.3)
    System.out.println(res2); // prints 9.884393063583817 (which is a good approximation)
    res2 = res1 * res2; // multiply res1 with res2, i.e., with 171/res1, we get 171/(171/res1)
    System.out.println(res2); // prints 171.0, that worked well!
    res2 = (171d / res1) * 17.3d; // (171d/res1)*17.3d ... res1 would ideally be 17.3, but is not
    System.out.println(res2); // prints 171.00000000000003: a bit off due to limited precision
    
    res1 = (((10d / 8d) * 8d) - 10.1d) + 0.1d; // this should be 0    
    System.out.println(res1); // prints 3.608224830031759E-16: limited precision (about 15 decimal places!)
    
    res1 = ((10.7d - 0.12d) - 10.7d + 0.12d); // this should be 0    
    System.out.println(res1); // prints 7.771561172376096E-16: limited precision (about 15 decimal places!)
    
    res1 = (8.5d % 4.1d); // compute the rest of the integer division of 8.5 and 4.1
    System.out.println(res1); // should be about (8.5-(2*4.1))=0.3, is 0.3000000000000007
  }
}
