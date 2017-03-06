import java.util.Scanner; // import the scanner class: ignore this for now

/** Examples for using if-then-else */
public class HelloSwitchCaseFallThrough {

  /** The main routine
   * @param args
   *          we ignore this parameter for now */
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
        // break; <- We comment out the break, so if the user types in "f", we will fall-through to the next
        // body after printing Mrs., i.e., we will print "Mrs. Mr. " as greeting
      }
      
      //$FALL-THROUGH$
      case "m":   // we will get here if gender is either "m" or "M"       //$NON-NLS-1$  
      case "M": { // or if the user entered "f" or "F" and we fell-through //$NON-NLS-1$  
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
