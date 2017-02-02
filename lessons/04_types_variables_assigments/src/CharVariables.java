/** Examples for character variables */
public class CharVariables {
  /**
   * The main routine
   * 
   * @param args
   *          we ignore this parameter for now
   */
  public static final void main(final String[] args) {
    char var; // allocate character variable "var"

    var = 'T'; // set variable var to 'T'
    System.out.println(var); // prints 'T'

    var = '\u597d'; // set variable var to unicode char 0x597d
    System.out.println(var); // prints the Chinese character for "good"
    
    var = '\n'; // set variable var to literal \n, which stands for newline
    System.out.println(var); // prints a newline, i.e., an empty line
    
    char space = ' '; // set space to a space character
    System.out.println(space); // prints ' '
    
    var = '\''; // setting var to ', using escaped single quote
    System.out.println(var); // prints '
  }
}
