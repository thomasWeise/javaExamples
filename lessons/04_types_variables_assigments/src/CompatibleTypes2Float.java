/** Examples for int-to-float compatibility */
public class CompatibleTypes2Float {
  /**
   * The main routine
   * 
   * @param args
   *          we ignore this parameter for now
   */
  public static final void main(final String[] args) {
    byte myByte = -128; // allocate byte variable "myByte"
    float myFloat = myByte; // store value of myByte into variable myFloat
    System.out.println(myFloat); // prints -128.0: no loss of infos, 8 bit fit into float mantissa

    short myShort = 32767; // now store the maximum short value in the variable
    myFloat= myShort; // and copy the value over to the new myFloat variable
    System.out.println(myFloat); // prints 32767.0: no loss of infos, 16 bit fit into float mantissa

    int myInt = 2147483646; // set myInt to the maximum integer value -1
    myFloat= myInt; // and copy it to the new long variable myLong
    System.out.println(myFloat); // prints 2.14748365E9, .e., rounding up to 2147483650

    long myLong = 9223372036854775806L; // set myLong to the maximum long value - 1
    myFloat= myLong; // and copy it to the new long variable myLong
    System.out.println(myFloat); // prints 9.223372E18, i.e., rounding down to 9223372000000000000L
  }
}
