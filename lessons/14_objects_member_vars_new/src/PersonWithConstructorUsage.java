/** Using class PersonWithConstructor representing a person:
 *  allocation, member variable setting, null, disposal. */
public class PersonWithConstructorUsage {
  
  /** The main routine
   * @param args
   *          we ignore this parameter */
  public static final void main(String[] args) {    
    PersonWithConstructor weise = new PersonWithConstructor("Weise", "Thomas"); //$NON-NLS-1$//$NON-NLS-2$    
    PersonWithConstructor chan = new PersonWithConstructor("Chan", "Jacky"); //$NON-NLS-1$//$NON-NLS-2$

    System.out.println(weise.givenName); // print the givenName of weise: "Thomas"
    System.out.println(weise.familyName); // print the familyName of weise: "Weise"
    
    weise.givenName = chan.givenName; // weise.givenName now points to same String object as chan.givenName
    System.out.println(weise.givenName); // print the givenName of weise: "Jacky"
    System.out.println(weise.familyName); // print the familyName of weise: "Weise"
    
    chan.givenName = "Kong-sang"; // change the given name of chan, given name of weise stays unchanged //$NON-NLS-1$
    System.out.println(weise.givenName); // print the givenName of weise: "Jacky"
    System.out.println(chan.givenName); // print the given name of Chan: "Kong-sang"
    
    weise = chan; // variables weise and chan now point to same object. this is NOT a copy: original weise object can be disposed by GC
    System.out.println(weise.givenName); // print the givenName of weise: "Kong-sang"
    System.out.println(weise.familyName); // print the familyName of weise: "Chan"
    
    chan.givenName = "Jacky"; // change givenName of object pointed to by chan (and weise) //$NON-NLS-1$
    System.out.println(chan.givenName); // print the givenName of chan: "Jacky"
    System.out.println(weise.givenName); // print the givenName of weise: "Jacky"
    
    chan = weise; // nothing changes, both variables still point to same object
    System.out.println(chan.familyName); // print the familyName of Chan: "Kong-sang"
    System.out.println(chan.givenName); // print the given name of Chan: "Chan"

    chan = null; // variable chan now does not point to an object anymore, but original chan object still referenced by weise
    System.out.println(weise.givenName); // print the givenName of weise: "Kong-sang"
    System.out.println(weise.familyName); // print the familyName of weise: "Chan"
    
    weise.givenName = null; // given name of weise is now null (btw, the string "Kong-sang" can eventually be disposed by GC)
    System.out.println(weise.givenName); // print the givenName of weise: null
    
    weise = null; // variable weise now does not point to an object anymore, original chan object no longer used, will eventually be disposed
    // System.out.println(weise.givenName); // this would crash: we do not point to any object
    // System.out.println(weise.familyName); // this would crash: we do not point to any object
  }
}
