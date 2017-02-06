/** Test classes A and B */
public class ABTest { 
  /** The main routine
   *  @param args
   *          we ignore this parameter */
  public static void main(String[] args) {
    A a = new A();   // create an instance of A
    a.doSomething(); // print 'A'
    B b = new B();   // create an instance of B
    b.doSomething(); // print 'B'
    
    a = b; // this is allowed, since B inherits from A
    a.doSomething(); // print 'B', since a now contains instance of B
  }
}
