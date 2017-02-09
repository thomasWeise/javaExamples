import java.util.HashMap;

/** a test for Hash Map, which relates key objects to value objects, each key must be unique */
public class HashMapTest {
  /** The main routine 
   *  @param args  we ignore this parameter */
  public static void main(String[] args) {
    HashMap<String,String> map = new HashMap<>();
    
    map.put("Hello",     "World!"); //$NON-NLS-1$ //$NON-NLS-2$
    map.put("It's",      "me!");    //$NON-NLS-1$ //$NON-NLS-2$
    map.put("Professor", "Weise");  //$NON-NLS-1$ //$NON-NLS-2$
    map.put("Weise",     "Thomas"); //$NON-NLS-1$ //$NON-NLS-2$
    map.put("Teacher",   "Weise"); //$NON-NLS-1$ //$NON-NLS-2$
    System.out.println(map); // {Professor=Weise, Hello=World!, Weise=Thomas, It's=me!, Teacher=Weise}
    
    map.put("It's",      "you, not me!"); //$NON-NLS-1$ //$NON-NLS-2$
    map.put("Professor", "Jacky Chan");   //$NON-NLS-1$ //$NON-NLS-2$
    System.out.println(map); // {Professor=Jacky Chan, Hello=World!, Weise=Thomas, It's=you, not me!, Teacher=Weise}
    
    System.out.println(map.remove("Professor")); // Jacky Chan //$NON-NLS-1$
    System.out.println(map); // {Hello=World!, Weise=Thomas, It's=you, not me!, Teacher=Weise}
    
    System.out.println(map.entrySet()); // [Hello=World!, Weise=Thomas, It's=you, not me!, Teacher=Weise]
    System.out.println(map.keySet());   // [Hello, Weise, It's, Teacher]
    System.out.println(map.values());   // [World!, Thomas, you, not me!, Weise]
    
    HashMap<String,String> other = new HashMap<>();
    other.put("Hello",   "China"); //$NON-NLS-1$ //$NON-NLS-2$
    other.put("Country", "China"); //$NON-NLS-1$ //$NON-NLS-2$
    other.put("Weise",   "Teacher"); //$NON-NLS-1$ //$NON-NLS-2$
    System.out.println(other); // {Hello=China, Weise=Teacher, Country=China}
    
    map.putAll(other);
    System.out.println(map);  // {Hello=China, Weise=Teacher, It's=you, not me!, Teacher=Weise, Country=China}
    
    for(String key : map.keySet()) {
      System.out.println(map.get(key)); // China \n Teacher \n you, not me! \n Weise \n China
    }
  }
}
