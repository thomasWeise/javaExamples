/** a modifiable number */
public class ModifiableNumber {
  /** the number value */
  private int value;
  /** are we ok */
  private boolean ok;
  
  /** create */
  public ModifiableNumber() {  this.ok = true; }
  /** add a value */
  public void add(final int v) { this.value += v; }
  
  /** divide by a value */
  public void divide(final int v) {
    try {                                             // if an ArithmeticException occurs between here and the } two lines below
      this.value /= v;                                // the control jumps directly to the code in the catch block
      System.out.println("Correct division by " + v); // this line here will only be reached if the division went OK //$NON-NLS-1$
    } catch(ArithmeticException error) { // (only) iff an ArithmeticException occurs, it is stored in variable error and the 2 lines below are executed
      System.out.println("Error when trying to divide " + this.value + " by " + v + ": " + error.getMessage()); //$NON-NLS-1$//$NON-NLS-2$//$NON-NLS-3$
      this.ok = false;
    }
  }
  
  /** convert to string */
  @Override
  public String toString() {
    return (this.ok ? ""+this.value : "error"); //$NON-NLS-1$  //$NON-NLS-2$
  }
  
  /** The main routine 
   *  @param args  we ignore this parameter */
  public static void main(String[] args) {
    ModifiableNumber n = new ModifiableNumber();
    System.out.println(n); // 0
    n.add(100);
    System.out.println(n); // 100
    n.divide(10);          // Correct division by 10
    System.out.println(n); // 10
    n.add(1);
    System.out.println(n); // 11
    n.divide(0);           // Error when trying to divide 11 by 0: / by zero
    System.out.println(n); // error
    n.add(1);
    System.out.println(n); // error
  }
}
