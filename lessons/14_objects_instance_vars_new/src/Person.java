/** A class representing a person. */
public class Person {
  
  /** the family name of the person */
  String familyName;
  /** the given name of the person */
  String givenName;
  
  /** The main routine
   *  @param args
   *          we ignore this parameter */
  public static final void main(String[] args) {
    Person weise = new Person(); // create person object  
    weise.familyName = "Weise"; // set the family name of object weise //$NON-NLS-1$
    weise.givenName = "Thomas"; // set the given name of object weise //$NON-NLS-1$
    
    Person chan = new Person(); // create person object
    chan.givenName = "Jacky"; // set the given name of object chan //$NON-NLS-1$
    chan.familyName = "Chan"; // set the family name of object chan //$NON-NLS-1$
    
    System.out.println(weise.givenName); // print the givenName of weise
    System.out.println(weise.familyName); // print the familyName of weise
    
    System.out.println(chan.familyName); // print the familyName of Chan
    System.out.println(chan.givenName); // print the given name of Chan
  }
}
