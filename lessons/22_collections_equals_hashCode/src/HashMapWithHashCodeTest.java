import java.util.HashMap;

/** a test for Hash Map */
public class HashMapWithHashCodeTest {
  /** The main routine 
   *  @param args  we ignore this parameter */
  public static void main(String[] args) {
    HashMap<IntHolderWithEqualsAndHashCode, String> map = new HashMap<>();

    map.put(new IntHolderWithEqualsAndHashCode(1), "A"); //$NON-NLS-1$
    System.out.println(map); // {1=A}
    map.put(new IntHolderWithEqualsAndHashCode(2), "B"); //$NON-NLS-1$
    System.out.println(map); // {1=A, 2=B}
    map.put(new IntHolderWithEqualsAndHashCode(3), "C"); //$NON-NLS-1$
    System.out.println(map); // {1=A, 2=B, 3=C}
    map.put(new IntHolderWithEqualsAndHashCode(1), "D"); //$NON-NLS-1$
    System.out.println(map); // {1=D, 2=B, 3=C}
    map.put(new IntHolderWithEqualsAndHashCode(3), "E"); //$NON-NLS-1$
    System.out.println(map); // {1=D, 2=B, 3=E}

    System.out.println(map.get(new IntHolderWithEqualsAndHashCode(1))); // D
    System.out.println(map.get(new IntHolderWithEqualsAndHashCode(2))); // B
    System.out.println(map.get(new IntHolderWithEqualsAndHashCode(3))); // E
    System.out.println(map.get(new IntHolderWithEqualsAndHashCode(4))); // null  <- key does not exist
  }
}
