import java.util.Scanner; // import class Scanner from the java.util package

import cn.edu.hfuu.iao.io.ForeignExchangeStudentReader; // import all needed data structure
import cn.edu.hfuu.iao.io.PersonReader;                 // and I/O classes from our sub-packages
import cn.edu.hfuu.iao.io.ProfessorReader;
import cn.edu.hfuu.iao.io.StudentReader;
import cn.edu.hfuu.iao.person.Person;

/** testing our package structure */
public class Main {
  /** The main routine reading person records of a certain type from stdin
   *  @param args we ignore this parameter */
  public static void main(String[] args) {
    PersonReader reader;
    Scanner scanner = new Scanner(System.in); // create a structured text reader

    System.err.println("Do you want to read (p)rofessors, (s)tudents, or (e)change students: "); //$NON-NLS-1$

    switch (scanner.nextLine().charAt(0)) { // check the first character entered by the user
      case 'p': { reader = new ProfessorReader(); break; } // p -> read professors
      case 's': { reader = new StudentReader();   break; } // s -> read students
      default: {  reader = new ForeignExchangeStudentReader(); break; } // otherwise: read exchange students
    }

    for (;;) { // loop forever, see loop condition at bottom of loop
      Person person = reader.read(scanner); // use the person read to read a person
      System.out.println("You entered: " + person); // print person.toString //$NON-NLS-1$
      System.out.println("Type enter to continue, Ctrl-D to exit."); //$NON-NLS-1$
      if (scanner.hasNextLine()) { // if user pressed enter
        scanner.nextLine();        // we read the line and continue
        continue;                  // and do another iteration
      }                            // if she instead pressed Ctrl-D or stdin ends, there is                
      return;                      // no next line and we exit the main routine
    }
  }
}
