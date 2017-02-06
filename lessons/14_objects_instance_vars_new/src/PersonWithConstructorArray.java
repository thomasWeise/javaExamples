/** An array of instances of class PersonWithConstructor class representing a person. */
public class PersonWithConstructorArray {

  /** The main routine
   *  @param args
   *          we ignore this parameter */
  public static final void main(String[] args) {

    PersonWithConstructor[] array = { // create and initialize an array
        new PersonWithConstructor("Weise", "Thomas"), //$NON-NLS-1$//$NON-NLS-2$
        new PersonWithConstructor("Chan", "Jacky"), //$NON-NLS-1$//$NON-NLS-2$
        new PersonWithConstructor("Onegin", "Eugene"), //$NON-NLS-1$//$NON-NLS-2$
    };

    for (PersonWithConstructor element : array) { // fast read-only iteration
      System.out.println(element.familyName);
    }
  }
}
