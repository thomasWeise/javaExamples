import java.util.Scanner; // import the scanner class: ignore this for now

/** Examples for using if-then-else */
public class HelloSwitchCase {
  /**
   * The main routine
   * 
   * @param args
   *          we ignore this parameter for now
   */
  public static final void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // initiate reading from System.in, ignore for now

    System.err.println("Please enter your name: "); // <--- using System.err for status //$NON-NLS-1$
    String name = scanner.nextLine(); // read next line from input and store in variable "string"

    System.err.println("Please your gender [f=female, m=male]: "); // <--- using System.err for status //$NON-NLS-1$

    String gender = scanner.next(); // read the gender from stdin
    switch (gender) { // choose what to do based on gender
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
        System.out.print(gender);
        System.out.print(' ');
        break;
      }
    }
    System.out.println(name);
  }
}
