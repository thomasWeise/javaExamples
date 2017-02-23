/** Examples for int-to-double compatibility */
public class CompatibleTypes2Double {

  /** The main routine
   * @param args
   *          we ignore this parameter for now */
  public static final void main(final String[] args) {
    byte myByte = -128; // allocate byte variable "myByte"
    double myDouble = myByte; // store value of myByte into variable myDouble
    System.out.println(myDouble); // prints -128.0: no loss of infos, 8 bit fit into double mantissa

    short myShort = 32767; // now store the maximum short value in the variable
    myDouble= myShort; // and copy the value over to the new myDouble variable
    System.out.println(myDouble); // prints 32767.0: no loss of infos, 16 bit fit into double mantissa

    int myInt = 2147483646; // set myInt to the maximum integer value -1
    myDouble= myInt; // and copy it to the new long variable myLong
    System.out.println(myDouble); // prints 2.147483646E9: no loss of infos, 32 bit fit into double mantissa

    long myLong = 9223372036854775806L; // set myLong to the maximum long value - 1
    myDouble= myLong; // and copy it to the new long variable myLong
    System.out.println(myDouble); // prints 9.223372036854776E18, i.e., rounding up to 9223372036854776000
  }
}
