/** Examples for String variables */
public class StringVariables {

  /** The main routine
   * @param args
   *          we ignore this parameter for now */
  public static final void main(final String[] args) {
    String var; // allocate String variable "var"

    var = "Hello World!"; // set variable var to "Hello World!" //$NON-NLS-1$
    System.out.println(var); // prints "Hello World!" (without the quotation marks)

    var = "Hello\nWorld!"; // set variable var to "Hello\nWorld!" //$NON-NLS-1$
    System.out.println(var); // prints Hello, newline, World!
    
    String niHao="\u4f60\u597d"; // set variable var to Hello in Chinese //$NON-NLS-1$
    System.out.println(niHao); // prints a "Ni Hao" in Chinese for Hello
    
    var = "\"Hello\""; // set variable var to "Hello" (using escaped double quotes) //$NON-NLS-1$
    System.out.println(var); // prints a "Hello" (without the quotation marks)
  }
}
