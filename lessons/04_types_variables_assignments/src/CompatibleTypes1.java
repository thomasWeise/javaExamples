/** Examples for lesslessly compatible variables */
public class CompatibleTypes1 {

  /** The main routine
   * @param args
   *          we ignore this parameter for now */
  public static final void main(final String[] args) {
    byte myByte = -128; // allocate byte variable "myByte"
    short myShort = myByte; // store value of myByte into variable myShort
    System.out.println(myShort); // prints -128

    myShort = 32767; // now store the maximum short value in the variable
    int myInt = myShort; // and copy the value over to the new myInt variable
    System.out.println(myInt); // prints 32767

    myInt = 2147483647; // set myInt to the maximum integer value
    long myLong = myInt; // and copy it to the new long variable myLong
    System.out.println(myLong); // prints 2147483647

    float myFloat = 1.4E-45f; // new float variable with the smallest positive float value
    double myDouble = myFloat; // copy its value into a double variable
    System.out.println(myDouble); // prints 1.401298464324817E-45, which is equivalent to 1.4E-45f    
  }
}
