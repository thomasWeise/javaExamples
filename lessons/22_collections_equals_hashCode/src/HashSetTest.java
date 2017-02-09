import java.util.HashSet;

/** a test for sets, a set can contain each element exactly once */
public class HashSetTest {
  /** The main routine 
   *  @param args  we ignore this parameter */
  public static void main(String[] args) {
    HashSet<String> set = new HashSet<>();
    
    System.out.println(set.add("Hello"));    // true  //$NON-NLS-1$
    System.out.println(set);                 // [Hello]
    System.out.println(set.add("World!"));   // true  //$NON-NLS-1$ 
    System.out.println(set);                 // [Hello, World!]
    System.out.println(set.add("World!"));   // false //$NON-NLS-1$
    System.out.println(set);                 // [Hello, World!]
    System.out.println(set.add("It's"));     // true //$NON-NLS-1$
    System.out.println(set);                 // [Hello, World!, It's]
    System.out.println(set.add("me!"));      // true //$NON-NLS-1$
    System.out.println(set);                 // [Hello, World!, It's, me!]
    
    System.out.println(set.contains("It's"));// true  //$NON-NLS-1$
    System.out.println(set.remove("It's"));  // true  //$NON-NLS-1$
    System.out.println(set);                 // [Hello, World!, me!
    System.out.println(set.contains("It's"));// false //$NON-NLS-1$]
    System.out.println(set.remove("It's"));  // false //$NON-NLS-1$
    System.out.println(set);                 // [Hello, World!, me!]       
  }
}
