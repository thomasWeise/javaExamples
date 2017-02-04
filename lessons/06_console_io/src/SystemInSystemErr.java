import java.util.Scanner; // import the scanner class: ignore this for now

/** Examples for using System.in and Scanner using System.err instead of System.out for user interaction */
public class SystemInSystemErr {

  /** The main routine
   * @param args
   *          we ignore this parameter for now */
  public static final void main(String[] args) {    
    Scanner scanner = new Scanner(System.in); // initiate reading from System.in, ignore for now
    
    String string;        
    System.err.println("Please enter string: ");//$NON-NLS-1$ // <--- using System.err for status
    string = scanner.nextLine(); // read next line from input and store in variable "string"    
    System.out.print("You wrote: '"); //$NON-NLS-1$
    System.out.print(string); // print the stuff we read
    System.out.println("'.");//$NON-NLS-1$
    
    System.err.println("Please enter int number: "); // tell user to enter number using StdErr //$NON-NLS-1$
    int value = scanner.nextInt(); // read the next integer from the input
    System.out.print("You wrote "); //$NON-NLS-1$
    System.out.print(value); // print the value we read
    System.out.print(" and 5 times "); //$NON-NLS-1$
    System.out.print(value); // print the value we read
    System.out.print(" is "); //$NON-NLS-1$
    System.out.println(value * 5); // print the value we read times 5, start new line
  }
}
