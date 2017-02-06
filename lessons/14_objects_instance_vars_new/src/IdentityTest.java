/** test objects whether they are the same via == */
public class IdentityTest {
  
  /** The main routine
   *  @param args
   *          we ignore this parameter */
  public static void main(String[] args) {    
    PersonWithConstructor personA = new PersonWithConstructor("Weise", "Thomas"); //$NON-NLS-1$ //$NON-NLS-2$
    System.out.println(personA.familyName + ' ' + personA.givenName); 
    
    PersonWithConstructor personB = new PersonWithConstructor("Weise", "Thomas"); //$NON-NLS-1$ //$NON-NLS-2$
    System.out.println(personB.familyName + ' ' + personB.givenName);
    
    System.out.println(personA == personB); // false: the variables hold same data, but are different objects!
    
    personB = personA; // now personB and personA reference the same object
    System.out.println(personA == personB); // true: both variables now reference the same instance
    
    ComplexNumber c1 = new ComplexNumber(0d); // create a complex number `0+0i`
    ComplexNumber c2 = new ComplexNumber(0d, 0d); // create a complex number `0+0i`
    
    System.out.println(c1 == c2); // false: the two variables hold the same data, but are different objects!
    System.out.println((c1 = c2) == c2); // true: both variables now reference the same instance
  }
}
