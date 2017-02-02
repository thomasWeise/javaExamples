import java.util.Scanner; // import the scanner class: ignore this for now

/** Examples for using if-then-else */
public class HelloIfThenElse {
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
    char gender = scanner.next().charAt(0); // read the next character from stdin

    System.out.print("Hello "); //$NON-NLS-1$
    if (gender == 'f') {
      System.out.print("Mrs. "); //$NON-NLS-1$
    } else {
      if (gender == 'm') {
        System.out.print("Mr. "); //$NON-NLS-1$
      }
    }
    System.out.println(name);
  }
}
