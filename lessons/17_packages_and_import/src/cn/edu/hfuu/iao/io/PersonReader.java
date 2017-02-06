package cn.edu.hfuu.iao.io;

import java.util.Scanner; // import class Scanner from the java.util package

import cn.edu.hfuu.iao.person.Person;

/** a class to read a person record from stdin*/
public class PersonReader {
  
  /** the constructor */
  public PersonReader(){  
  }
  
  /** read a person record from stdin
   * @return the new person record  */
  public Person read(Scanner scanner) {    
    System.err.println("Enter person's family name:"); //$NON-NLS-1$
    String familyName = scanner.nextLine();    
    System.err.println("Enter person's given name:"); //$NON-NLS-1$
    String givenName = scanner.nextLine();
    
    return new Person(familyName, givenName);
  }
}
