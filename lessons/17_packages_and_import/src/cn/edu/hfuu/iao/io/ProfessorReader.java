package cn.edu.hfuu.iao.io;

import java.util.Scanner; // import class Scanner from the java.util package

import cn.edu.hfuu.iao.person.Professor;

/** a class to read a professor record from stdin*/
public class ProfessorReader extends PersonReader {
  
  /** the constructor */
  public ProfessorReader(){  
  }
  
  /** read a profesor record from stdin
   * @return the new person record */
  @Override
  public Professor read(Scanner scanner) { 
    System.err.println("Enter professor's family name:"); //$NON-NLS-1$    
    String familyName = scanner.nextLine();    
    System.err.println("Enter professor's given name:"); //$NON-NLS-1$
    String givenName = scanner.nextLine();
    
    return new Professor(familyName, givenName);
  }
}
