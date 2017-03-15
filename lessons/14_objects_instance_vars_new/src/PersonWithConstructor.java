/** A class representing a person. */
public class PersonWithConstructor {
  
  /** the family name of the person */
  String familyName;
  /** the given name of the person */
  String givenName;
  
  /** create a person record and set its name */
  PersonWithConstructor(String _familyName, String _givenName) {
    this.familyName = _familyName;
    this.givenName = _givenName;
  }
  
  /** The main routine
   *  @param args we ignore this parameter */
  public static final void main(String[] args) {
    
    PersonWithConstructor weise = new PersonWithConstructor(// create person object by
        "Weise", "Thomas"); //$NON-NLS-1$//$NON-NLS-2$      // calling the constructor
    
    PersonWithConstructor chan = new PersonWithConstructor(// create person object by
        "Chan", "Jacky"); //$NON-NLS-1$//$NON-NLS-2$      // calling the constructor

    System.out.println(weise.givenName); // print the givenName of Thomas
    System.out.println(weise.familyName); // print the familyName of Weise
    
    System.out.println(chan.familyName); // print the familyName of Chan
    System.out.println(chan.givenName); // print the given name of Jacky
  }
}
