/** Examples for bit shifting in integer expressions */
public class IntegerBitShifting {

  /** The main routine
   * @param args
   *          we ignore this parameter for now */
  public static final void main(String[] args) {
    int res; // declare int variable res
    
    res = 128; // store 128 = 2^7 in variable "res" (we use "^" here as power operator, not as xor...)
    System.out.println(res); // prints 128
    res = res << 2; // shift res two bits to the left: get 2^(7+2) = 2^9 = 512
    System.out.println(res); // prints 512, as  res<<x is equivalent to  res*2^x
    
    res = res >> 3; // shift res three bits to the right: get 2^(9-3) = 2^6 = 64
    System.out.println(res); // prints 64, as  res>>x is equivalent to res/(2^x)
    
    res = 0b11000000_00000000_00000000_00000000; // store 3 << 30 in binary form in res
    System.out.println(res); // prints -1073741824 (highest-order bit in the two's complement determines sign)
    
    res = 0b11000000_00000000_00000000_00000000 >> 1; // shift -1073741824 right by 1 without touching sign
    System.out.println(res); // prints -1073741824 / 2 = -536870912, >>x is equivalent to signed div by 2^x
    
    res = 0b11000000_00000000_00000000_00000000 >>> 1; // shift -1073741824 right by 1 and shift sign stuff too
    System.out.println(res); // prints -1610612736, 0b11000000_00000000_00000000_00000000 would be
                             // unsigned int 3221225472 and 3221225472/2 = 1610612736 
  }
}
