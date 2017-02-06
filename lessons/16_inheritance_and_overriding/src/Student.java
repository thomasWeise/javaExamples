/** A class representing a student */
public class Student extends Person { // class Student extends class Person
  /** the id of the student */
  String id; // Class student adds the new field 'id'

  /** create a student record and set its name and student id */
  Student(String _familyName, String _givenName, String _id) {
    super(_familyName, _givenName); // invoke the inherited constructor of Person setting up the name
    this.id = _id;
  }
  
  /** a new method */
  void inLecture() { System.out.println("Student " + this.toString() + " fell asleep.");} //$NON-NLS-1$//$NON-NLS-2$
  
  /** The main routine
   *  @param args
   *          we ignore this parameter */
  public static void main(String[] args) {
    Person person = new Person("Weise", "Thomas"); //$NON-NLS-1$//$NON-NLS-2$
    System.out.println(person); // print the result of person.toString()
    
    Student student = new Student("Chan", "Jacky", "S01"); //$NON-NLS-1$//$NON-NLS-2$//$NON-NLS-3$
    System.out.println(student); // print the result of student.toString(): the inherited toString method
    System.out.println(student.id); // print the value of the id field, namely "S01"    
    // System.out.println(person.id); // <- we cannot do that, because Person does not have such a field
    
    student.inLecture(); //invoke the method inLecture implemented by class Student
    //person.inLecture(); <- we cannot do this, because Person does not implement this method
    
    System.out.println(person instanceof Person); // true: variable person holds an instance of class Person
    System.out.println(person instanceof Student); // false: variable person does not hold an instance of class Student
    System.out.println(student instanceof Student); // true: every instance of Student is also an instance of Person
    System.out.println(student instanceof Person); // true: hence, variable student also holds an instance of person
    
    person = student; // we can do this, since variable student is guaranteed to hold an instance of Sstudent (or null)
    // student = person; <- but we can never do this, as some persons (like Weise above) are no students
    System.out.println(person); // print "Jacky Chan", the result of person.toString()
    System.out.println(person instanceof Person); // true: variable person holds an instance of class Person
    System.out.println(person instanceof Student); // true: variable person now also holds an instance of class Student
  }
}
