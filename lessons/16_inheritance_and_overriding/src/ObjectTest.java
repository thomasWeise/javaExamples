/** test the interplay of Strings and objects in the class hierarchy */
public class ObjectTest {

  /** The main routine
   *  @param args
   *          we ignore this parameter */
  public static void main(String[] args) {
    Person person = new Professor("Weise", "Thomas"); //$NON-NLS-1$ //$NON-NLS-2$
    System.out.println(person); // "Prof. Thomas Weise"

    String text = person.toString();
    System.out.println(text); // "Prof. Thomas Weise"

    Object object = person; // store person in an object variable
    System.out.println(object); // "Prof. Thomas Weise"

    System.out.println(person == object);// true, both variables reference same object
    System.out.println(text == object);// false, text references a String, object is a Professor

    object = text;
    System.out.println(person == object);// false, object is now a String, person is a Professor
    System.out.println(text == object);// true, text and object reference the same object

    object = new int[34];
    System.out.println(person == object);// false, object is now an int array, person is a Professor
    System.out.println(text == object);// false, object is now an int array, text is a String
  }
}
