package cn.edu.hfuu.iao.person; // declare the package cn.edu.hfuu.iao.person

/** A class representing a professor */
public class Professor extends Person { // class Processor extends class Person
  /** create a person record and set its name */
  public Professor(String _familyName, String _givenName) {
    super(_familyName, _givenName); 
  }
  
  /** return "Prof. " + result of super.toString() = Person.toString() */
  @Override // mark this method explicitly as overridden
  public String toString() { 
    return "Prof. " + super.toString(); //$NON-NLS-1$
  }
 
}
