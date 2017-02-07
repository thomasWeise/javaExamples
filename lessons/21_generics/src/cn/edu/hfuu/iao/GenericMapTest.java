package cn.edu.hfuu.iao;

import cn.edu.hfuu.iao.collections.GenericMap;

/** a class where we use our generic map */
public class GenericMapTest {
  /** The main routine 
   *  @param args  we ignore this parameter */
  public static void main(String[] args) {
    GenericMap<String,String> map = new GenericMap<>();

    map.put("Hello", "World!");             //$NON-NLS-1$ //$NON-NLS-2$
    System.out.println(map);                // Hello=World!
    
    map.put("Country", "China");            //$NON-NLS-1$ //$NON-NLS-2$
    System.out.println(map);                // Hello=World!, Country=China    
    System.out.println(map.get("Country")); // China //$NON-NLS-1$ 
    System.out.println(map.get("Hello"));   // World //$NON-NLS-1$
    System.out.println(map.get("World!"));  // null, World! is not a key //$NON-NLS-1$  
    
    map.put("Computer Science", "Fun");     //$NON-NLS-1$ //$NON-NLS-2$
    System.out.println(map);                // Hello=World!, Country=China, Computer Science=Fun
    
    String str = map.get("Hello");          // this does now work, we do no longer need to cast //$NON-NLS-1$
    System.out.println(str);                // World!
    
    Object obj1 = str;
    Object obj2 = "You";                    //$NON-NLS-1$
    // map.put(obj1, obj2);                 // this is no longer allowed, the parameters must be Strings
    map.put((String)obj1, (String)obj2);    // we now need to type cast
    // System.out.println(map.get(obj1));   // this is no longer allowed, keys need to be Strings
    System.out.println(map.get((String)obj1)); // You
  }
}
