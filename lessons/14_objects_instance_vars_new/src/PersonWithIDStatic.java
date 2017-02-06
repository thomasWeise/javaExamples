/** A class representing a person with unique counted id. */
public class PersonWithIDStatic {
  
  /** the static variable counting the person objects */
  static int idCounter = 0;
  
  /** the family name of the person */
  String familyName;
  /** the given name of the person */
  String givenName;
  /** the id of the person */
  int id;
  
  /** create a person record and set its name */
  PersonWithIDStatic(String _familyName, String _givenName) {
    this.familyName = _familyName;
    this.givenName = _givenName;
    this.id = (++PersonWithIDStatic.idCounter); // increase the id counter and set the id of his object
  }
  
  /** The main routine
   *  @param args
   *          we ignore this parameter */
  public static final void main(String[] args) {
    
    System.out.println(idCounter); // print the id counter: 0
    
    PersonWithIDStatic weise = new PersonWithIDStatic("Weise", "Thomas"); //$NON-NLS-1$//$NON-NLS-2$
    
    System.out.println(idCounter); // print the id counter: 1
    
    PersonWithIDStatic chan = new PersonWithIDStatic("Chan", "Jacky"); //$NON-NLS-1$//$NON-NLS-2$

    System.out.println(weise.givenName); // print the givenName of weise
    System.out.println(weise.familyName); // print the familyName of weise
    System.out.println(weise.id); // print the id of weise: 1
    System.out.println(idCounter); // print the id counter: 2
    
    System.out.println(chan.familyName); // print the familyName of Chan
    System.out.println(chan.givenName); // print the given name of Chan
    System.out.println(chan.id); // print the id of chan: 2
    System.out.println(weise.id); // print the id of weise: 1
    System.out.println(idCounter); // print the id counter: 2
  }
}
