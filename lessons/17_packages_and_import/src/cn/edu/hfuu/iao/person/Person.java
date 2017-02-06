package cn.edu.hfuu.iao.person; // declare the package cn.edu.hfuu.iao.person 

/** A class representing a person with constructor and toString method. */
public class Person {
  /** the family name of the person */
  String familyName;
  /** the given name of the person */
  String givenName;

  /** create a person record and set its name */
  public Person(String _familyName, String _givenName) {
    this.familyName = _familyName;
    this.givenName = _givenName;
  }

  /** return a string representation of this person record */
  public String toString() {
    return this.givenName + ' ' + this.familyName;
  }
}
