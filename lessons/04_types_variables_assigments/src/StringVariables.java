/** Examples for String variables */
public class StringVariables {
  /**
   * The main routine
   * 
   * @param args
   *          we ignore this parameter for now
   */
  public static final void main(final String[] args) {
    String var; // allocate String variable "var"

    var = "Hello World!"; // set variable var to "Hello World!" //$NON-NLS-1$
    System.out.println(var); // prints "Hello World!"

    var = "Hello\nWorld!"; // set variable var to "Hello\nWorld!" //$NON-NLS-1$
    System.out.println(var); // prints Hello, newline, World!
    
    String niHao="\u597d\u4f60"; // set variable var to Hello in Chinese //$NON-NLS-1$
    System.out.println(niHao); // prints a Ni Hao
  }
}
