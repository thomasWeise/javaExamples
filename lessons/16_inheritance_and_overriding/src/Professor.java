/** A class representing a professor */
public class Professor extends Person { // class Processor extends class Person
  /** create a person record and set its name */
  Professor(String _familyName, String _givenName) {
    super(_familyName, _givenName); // invoke the inherited constructor of Person setting up the name
  }
  
  /** return "Prof. " + the result of super.toString() = Person.toString() */
  @Override // mark this method explicitly as overriden: explicitly remind programmers about this
  public String toString() { 
    return "Prof. " + super.toString(); // "Prof. " + super implementation of toString() from Person //$NON-NLS-1$
  }
  
  /** The main routine
   *  @param args
   *          we ignore this parameter */
  public static void main(String[] args) {
    Person person = new Person("Chan", "Jacky"); //$NON-NLS-1$//$NON-NLS-2$
    System.out.println(person); // print the result of person.toString()
    
    Professor professor = new Professor("Weise", "Thomas"); //$NON-NLS-1$//$NON-NLS-2$
    System.out.println(professor); // print the result of professor.toString(): "Prof. " + the result of Person.toString()
    
    System.out.println(person instanceof Person); // true: variable person holds an instance of class Person
    System.out.println(person instanceof Professor); // false: variable person does not hold an instance of class Professor
    System.out.println(person instanceof Student); // false: variable person does not hold an instance of class Student
    
    System.out.println(professor instanceof Professor); // true: every instance of Professor is also an instance of Person
    // System.out.println(professor instanceof Student); // will always be false, but compiler sees this and warns us
    System.out.println(professor instanceof Person); // true: hence, variable professor also holds an instance of person
    
    person = professor; // we can do this, since variable professor is guaranteed to hold an instance of professor (or null)
    // professor = person; <- but we can never do this, as some persons (like Weise above) are no professor
    System.out.println(person); // print "Prof. Thomas Weise", the result of the toString() of the class Professor
    System.out.println(person instanceof Person); // true: variable person holds an instance of class Person
    System.out.println(person instanceof Professor); // true: variable person now also holds an instance of class Student
  }
}
