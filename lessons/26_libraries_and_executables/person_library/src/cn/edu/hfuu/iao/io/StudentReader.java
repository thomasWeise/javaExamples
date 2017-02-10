package cn.edu.hfuu.iao.io;

import java.util.Scanner; // import class Scanner from java.util
//import class Student from package cn.edu.hfuu.iao.person
import cn.edu.hfuu.iao.person.Student;

/** a class to read a student record from stdin*/
public class StudentReader extends PersonReader {
  
  /** the constructor */
  public StudentReader(){  
  }
  
  /** read a student record from scanner (pointing to stdin)
   * @return the new person record */
  @Override
  public Student read(Scanner scanner) { 
    System.err.println("Enter student's family name:"); //$NON-NLS-1$
    String familyName = scanner.nextLine();   // read a string from scanner  
    System.err.println("Enter student's given name:"); //$NON-NLS-1$
    String givenName = scanner.nextLine(); // read a string from scanner
    System.err.println("Enter student's ID:"); //$NON-NLS-1$
    String id = scanner.nextLine(); // read a string from scanner
    
    return new Student(familyName, givenName, id);
  }
}
