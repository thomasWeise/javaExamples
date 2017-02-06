/** A class representing a person with constructor and toString method. */
public class PersonWithToString {
  /** the family name of the person */
  String familyName;
  /** the given name of the person */
  String givenName;

  /** create a person record and set its name */
  PersonWithToString(String _familyName, String _givenName) {
    this.familyName = _familyName;
    this.givenName = _givenName;
  }

  /** return a string representation of this person record */
  public String toString() {
    return this.givenName + ' ' + this.familyName;
  }

  /**
   * The main routine
   * 
   * @param args
   *          we ignore this parameter
   */
  public static final void main(String[] args) {
    PersonWithToString weise = new PersonWithToString("Weise", "Thomas"); //$NON-NLS-1$//$NON-NLS-2$
    System.out.println(weise.toString()); // print a string representing the weise object
    System.out.println(weise); // the same as above: a String is expected, weise.toString is  called

    System.out.println(new PersonWithToString("Chan", "Jacky")); //$NON-NLS-1$//$NON-NLS-2$
  }
}
