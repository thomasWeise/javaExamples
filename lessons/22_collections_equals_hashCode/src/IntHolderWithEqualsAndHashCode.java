/** a holder class for an integer */
public final class IntHolderWithEqualsAndHashCode {
  /** the integer value */
  private final int value;
  
  /** create the integer value holder */
  public IntHolderWithEqualsAndHashCode(final int _value) {
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
    return ((o instanceof IntHolderWithEqualsAndHashCode) && // check if right class
            (((IntHolderWithEqualsAndHashCode)o).value == this.value));
  }
  
  /** override the hashCode method from Object to return an integer number representing this instance (luckily, our only instance variable is an int)*/
  @Override
  public int hashCode() { // normally, your class will have more complex member variables, say objects, strings, doubles, etc.
    return this.value;    // you would then return some combination of their hashCodes()
  }                       // the hash code of a list, for instance, is something like a special sum of its element's hash codes
  
  
  /** The main routine 
   *  @param args  we ignore this parameter */
  public static void main(String[] args) {
    IntHolderWithEqualsAndHashCode a = new IntHolderWithEqualsAndHashCode(1);
    IntHolderWithEqualsAndHashCode b = new IntHolderWithEqualsAndHashCode(2);
    IntHolderWithEqualsAndHashCode c = new IntHolderWithEqualsAndHashCode(1);
    
    System.out.println(a.hashCode());  // 1 <-- this has changed, we now get the same
    System.out.println(b.hashCode());  // 2 <-- hash codes for the same data
    System.out.println(c.hashCode());  // 1 <-- see?
    
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
