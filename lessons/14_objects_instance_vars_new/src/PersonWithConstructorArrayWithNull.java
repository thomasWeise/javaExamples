/** An array of instances of class PersonWithConstructor class representing a person. */
public class PersonWithConstructorArrayWithNull {

  /** The main routine
   *  @param args
   *          we ignore this parameter */
  public static final void main(String[] args) {

    PersonWithConstructor[] array = { // create and initialize an array
        new PersonWithConstructor("Weise", "Thomas"), //$NON-NLS-1$//$NON-NLS-2$
        new PersonWithConstructor("Chan", "Jacky"), //$NON-NLS-1$//$NON-NLS-2$
        null, // nothing
        new PersonWithConstructor("Onegin", "Eugene"), //$NON-NLS-1$//$NON-NLS-2$
    };

    for (PersonWithConstructor element : array) { // fast read-only iteration
      if (element != null) { // check for null, we would get an error when trying null.familyName...
        System.out.println(element.familyName);
      } else { // ok, null -> print something elese
        System.out.println("Missing element!");//$NON-NLS-1$
      }
    } // Weise \n Chan \n Missing element! \n Onegin
  }
}
