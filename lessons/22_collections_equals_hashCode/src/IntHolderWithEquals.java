/** a holder class for an integer */
public final class IntHolderWithEquals {
  /** the integer value */
  private final int value;
  
  /** create the integer value holder */
  public IntHolderWithEquals(final int _value) {
    this.value = _value;
  }
  
  /** get the string representation of this value */
  @Override
  public String toString() {
    return "" + this.value; //$NON-NLS-1$
  }
  
  /** override the equals method from Object checking for equality */
  @Override
  public boolean equals(final Object o) {
    return ((o instanceof IntHolderWithEquals) && // check if right class
            (((IntHolderWithEquals)o).value == this.value));
  }
  
  
  /** The main routine 
   *  @param args  we ignore this parameter */
  public static void main(String[] args) {
    IntHolderWithEquals a = new IntHolderWithEquals(1);
    IntHolderWithEquals b = new IntHolderWithEquals(2);
    IntHolderWithEquals c = new IntHolderWithEquals(1);
    
    System.out.print(a == a); System.out.print(' '); System.out.println(a.equals(a)); // true  true
    System.out.print(a == b); System.out.print(' '); System.out.println(a.equals(b)); // false false
    System.out.print(a == c); System.out.print(' '); System.out.println(a.equals(c)); // false true
    System.out.print(b == a); System.out.print(' '); System.out.println(b.equals(a)); // false false
    System.out.print(b == b); System.out.print(' '); System.out.println(b.equals(b)); // true  true
    System.out.print(b == c); System.out.print(' '); System.out.println(b.equals(c)); // false false
    System.out.print(c == a); System.out.print(' '); System.out.println(c.equals(a)); // false true
    System.out.print(c == b); System.out.print(' '); System.out.println(c.equals(b)); // false false
    System.out.print(c == c); System.out.print(' '); System.out.println(c.equals(c)); // true  true
  }
}
