/** Examples for using command line arguments (and if-then-else) */
public class HelloSwitchCaseArgs {
  /**
   * The main routine
   * 
   * @param args
   *          the command line arguments of the program (no longer ignored ^_^)
   */
  public static final void main(String[] args) {

    if (args.length < 2) { // check if there are at least two arguments, if not, print help and exit
      System.out.println("Please specify two arguments: your family name and your gender."); //$NON-NLS-1$
    } else { // OK, we have at least two command line arguments
      System.out.print("Hello "); // just print hello //$NON-NLS-1$
      switch (args[1]) { // choose what to do based on gender provided as second command line argument
        case "f": //$NON-NLS-1$
        case "F": {// we will get here if gender is either "f" or "F" //$NON-NLS-1$
          System.out.print("Mrs. "); //$NON-NLS-1$
          break;
        }

        case "m": //$NON-NLS-1$
        case "M": {// we will get here if gender is either "m" or "M" //$NON-NLS-1$
          System.out.print("Mr. "); //$NON-NLS-1$
          break;
        }

        default: { // we will get here if the gender is neither "f", "F", "m", "M"
          System.out.print(args[1]);
          System.out.print(' ');
          break;
        }
      }
      System.out.println(args[0]); // print family name, the first command line arg
    }
  }
}
