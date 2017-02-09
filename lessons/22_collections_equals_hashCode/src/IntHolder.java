/** a holder class for an integer */
public final class IntHolder {
  /** the integer value */
  private final int value;
  
  /** create the integer value holder */
  public IntHolder(final int _value) {
    this.value = _value;
  }
  
  /** get the string representation of this value */
  @Override
  public String toString() {
    return "" + this.value; //$NON-NLS-1$
  }
  
  /** The main routine 
   *  @param args  we ignore this parameter */
  public static void main(String[] args) {
    IntHolder a = new IntHolder(1);
    IntHolder b = new IntHolder(2);
    IntHolder c = new IntHolder(1);
    
    System.out.print(a == a); System.out.print(' '); System.out.println(a.equals(a)); // true  true
    System.out.print(a == b); System.out.print(' '); System.out.println(a.equals(b)); // false false
    System.out.print(a == c); System.out.print(' '); System.out.println(a.equals(c)); // false false
    System.out.print(b == a); System.out.print(' '); System.out.println(b.equals(a)); // false false
    System.out.print(b == b); System.out.print(' '); System.out.println(b.equals(b)); // true  true
    System.out.print(b == c); System.out.print(' '); System.out.println(b.equals(c)); // false false
    System.out.print(c == a); System.out.print(' '); System.out.println(c.equals(a)); // false false
    System.out.print(c == b); System.out.print(' '); System.out.println(c.equals(b)); // false false
    System.out.print(c == c); System.out.print(' '); System.out.println(c.equals(c)); // true  true
  }
}
