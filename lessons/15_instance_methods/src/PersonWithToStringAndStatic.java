/** A class representing a person with constructor and toString method. */
public class PersonWithToStringAndStatic {
  /** the family name of the person */
  String familyName;
  /** the given name of the person */
  String givenName;

  /** create a person record and set its name */
  PersonWithToStringAndStatic(String _familyName, String _givenName) {
    this.familyName = _familyName;
    this.givenName = _givenName;
  }

  /** return a string representation of this person record */
  public String toString() {
    return this.givenName + ' ' + this.familyName;
  }

  /** return a string representation of a person record */
  public static String toString(PersonWithToStringAndStatic person) {
    return person.givenName + ' ' + person.familyName;
  }
  
  /** The main routine
   *  @param args
   *          we ignore this parameter */
  public static final void main(String[] args) {
    PersonWithToStringAndStatic weise = new PersonWithToStringAndStatic("Weise", "Thomas"); //$NON-NLS-1$//$NON-NLS-2$
    System.out.println(weise.toString()); // print a string representing the weise object, obtained from instance method toString()
    System.out.println(weise); // the same as above: a String is expected, weise.toString is  called
    System.out.println(toString(weise)); // invoke static method toString and print its result

    System.out.println(new PersonWithToStringAndStatic("Chan", "Jacky")); // using instance method toString //$NON-NLS-1$//$NON-NLS-2$
    System.out.println(toString(new PersonWithToStringAndStatic("Chan", "Jacky"))); // using static toString //$NON-NLS-1$//$NON-NLS-2$
  }
}
