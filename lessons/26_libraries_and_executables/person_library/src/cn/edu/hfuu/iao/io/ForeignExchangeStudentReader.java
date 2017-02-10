package cn.edu.hfuu.iao.io;

import java.util.Scanner; // import class Scanner from java.util
//import class ForeignExchangeStudent from package cn.edu.hfuu.iao.person
import cn.edu.hfuu.iao.person.ForeignExchangeStudent;

/** a class to read a student record from stdin*/
public class ForeignExchangeStudentReader extends PersonReader {
  
  /** the constructor */
  public ForeignExchangeStudentReader(){  
  }
  
  /** read a foreign exchange student record from scanner (pointing to stdin)
   * @return the new person record */
  @Override
  public ForeignExchangeStudent read(Scanner scanner) { 
    System.err.println("Enter exchange student's family name:"); //$NON-NLS-1$
    String familyName = scanner.nextLine(); // read a string from scanner   
    System.err.println("Enter exchange student's given name:"); //$NON-NLS-1$
    String givenName = scanner.nextLine(); // read a string from scanner
    System.err.println("Enter exchange student's ID:"); //$NON-NLS-1$
    String id = scanner.nextLine(); // read a string from scanner
    System.err.println("Enter exchange student's home country:"); //$NON-NLS-1$
    String country = scanner.nextLine(); // read a string from scanner
    
    return new ForeignExchangeStudent(familyName, givenName, id, country);
  }
}
