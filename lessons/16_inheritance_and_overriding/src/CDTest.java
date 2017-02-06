/** Test classes C and D */
public class CDTest { 
  /** The main routine
   *  @param args
   *          we ignore this parameter */
  public static void main(String[] args) {
    C c = new C();   // create an instance of C
    c.doSomething(); // print 'C'
  // ^- the Eclipse compiler will complain about that (and rightly so!)
    
    D d = new D();   // create an instance of D
    d.doSomething(); // print 'D'
  // ^- the Eclipse compiler will complain about that (and rightly so!)
    
    c = d; // this is allowed, since D inherits from C
    c.doSomething(); // print still 'C', since static methods are not overridden
  // ^- the Eclipse compiler will complain about that (and rightly so!)
  }
}
