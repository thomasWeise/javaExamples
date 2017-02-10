package cn.edu.hfuu.iao.person; // declare the package cn.edu.hfuu.iao.person

/** A class representing a student */
public class Student extends Person { // class Student extends class Person
  /** the id of the student */
  String id;

  /** create a student record and set its name and student id */
  public Student(String _familyName, String _givenName, String _id) {
    super(_familyName, _givenName);
    this.id = _id;
  }
  
  /** return a string representation of this student record */
  @Override // mark this method explicitly as overridden
  public String toString() {
    return "student " + super.toString(); //$NON-NLS-1$
  }
}
