package cn.edu.hfuu.iao.io;

/** a class to read a person record from stdin: using canonical class names*/
public class PersonReader {
  
  /** the constructor */
  public PersonReader(){  
  }
  
  /** Read a person record from stdin. All class names are specified canonically
   * @return the new person record  */
  public cn.edu.hfuu.iao.person.Person read(java.util.Scanner scanner) {    
    System.err.println("Enter person's family name:"); //$NON-NLS-1$
    String familyName = scanner.nextLine(); // read a string from scanner
    System.err.println("Enter person's given name:"); //$NON-NLS-1$
    String givenName = scanner.nextLine(); // read a string from scanner
    
    return new cn.edu.hfuu.iao.person.Person(familyName, givenName);
  }
}
