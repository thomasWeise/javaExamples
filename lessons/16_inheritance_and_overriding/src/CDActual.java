/** Test classes C and D: what actually happens */
public class CDActual { 
  /** The main routine
   *  @param args
   *          we ignore this parameter */
  public static void main(String[] args) {
    C c = new C();   // create an instance of C, but never actually use it
   // ^- the Eclipse compiler will complain about that (and rightly so!)
    
    C.doSomething(); // print 'C'
    D d = new D();   // create an instance of D,  but never actually use it
    D.doSomething(); // print 'D'
    
    c = d; // this is allowed, since D inherits from C
    C.doSomething(); // print still 'C', since static methods are not overridden
  }
}
