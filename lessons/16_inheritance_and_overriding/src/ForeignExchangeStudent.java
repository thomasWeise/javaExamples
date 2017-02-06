/** A class representing a foreign exchange student */
public class ForeignExchangeStudent extends Student { // class ForeignExchangeStudent extends class Student
  /** the home country of the student */
  String homeCountry; // we add a new field

  /** create a student record and set its name, student id, and home country */
  ForeignExchangeStudent(String _familyName, String _givenName, String _id, final String country) {
    super(_familyName, _givenName, _id); // invoke the inherited constructor of Student setting up the name and id
    this.homeCountry = country;
  }
  
  /** override method inLecture() from Student */
  @Override
  public void inLecture() { super.inLecture(); System.out.println("Then wakes up."); super.inLecture();}  //$NON-NLS-1$
  
  /** override toString() from Person */
  @Override
  public String toString() { return super.toString() + " from " + this.homeCountry; }//$NON-NLS-1$
  
  /** The main routine
   *  @param args
   *          we ignore this parameter */
  public static void main(String[] args) {
    ForeignExchangeStudent student = new ForeignExchangeStudent("Onegin", "Eugene", //$NON-NLS-1$//$NON-NLS-2$ 
        "S02", "Russia"); //$NON-NLS-1$//$NON-NLS-2$
    
    System.out.println(student); // print the result of student.toString(): the inherited toString method
    System.out.println(student.id); // print the value of the id field, namely "S02"    
    System.out.println(student.homeCountry); // print the value of the home country d field, namely "Russia"
    
    student.inLecture(); //invoke method inLecture originally overridden by class ForeignExchangeStudent over class Student
    
    System.out.println(student instanceof ForeignExchangeStudent); // true: ForeignExchangeStudent instances are instances of Student
    System.out.println(student instanceof Student); // true: instances of Student are instances of Person
    System.out.println(student instanceof Person); // true: hence, variable student also holds an instance of person
    
    Person person = student; // we can do this, variable student is guaranteed to hold an instance of ForeignExchangeStudent (or null)
    // student = person; <- but we can never do this, as some persons are no students
    System.out.println(person); // print "Eugene Onegin from Russia", the result of person.toString()
    System.out.println(person instanceof Person); // true: variable person holds an instance of class Person
    System.out.println(person instanceof Student); // true: variable person now holds an instance of class Student
    System.out.println(person instanceof ForeignExchangeStudent); // true: variable person  holds an instance of class ForeignStudent
  }
}
