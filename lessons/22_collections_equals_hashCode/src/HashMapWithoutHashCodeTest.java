import java.util.HashMap;

/** a test for Hash Map */
public class HashMapWithoutHashCodeTest {
  /** The main routine 
   *  @param args  we ignore this parameter */
  public static void main(String[] args) {
    HashMap<IntHolderWithEqualsWithoutHashCode, String> map = new HashMap<>();

    map.put(new IntHolderWithEqualsWithoutHashCode(1), "A"); //$NON-NLS-1$
    System.out.println(map); // {1=A}
    map.put(new IntHolderWithEqualsWithoutHashCode(2), "B"); //$NON-NLS-1$
    System.out.println(map); // {1=A, 2=B}
    map.put(new IntHolderWithEqualsWithoutHashCode(3), "C"); //$NON-NLS-1$
    System.out.println(map); // {1=A, 2=B, 3=C}
    map.put(new IntHolderWithEqualsWithoutHashCode(1), "D"); //$NON-NLS-1$
    System.out.println(map); // {1=A, 2=B, 1=D, 3=C}
    map.put(new IntHolderWithEqualsWithoutHashCode(3), "E"); //$NON-NLS-1$
    System.out.println(map); // {1=A, 2=B, 1=D, 3=C, 3=E}

    System.out.println(map.get(new IntHolderWithEqualsWithoutHashCode(1))); // null <- key lost
    System.out.println(map.get(new IntHolderWithEqualsWithoutHashCode(2))); // null <- key lost
    System.out.println(map.get(new IntHolderWithEqualsWithoutHashCode(3))); // null <- key lost
    System.out.println(map.get(new IntHolderWithEqualsWithoutHashCode(4))); // null <- key does not exist
  }
}
