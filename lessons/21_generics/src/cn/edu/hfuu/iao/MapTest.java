package cn.edu.hfuu.iao;

import cn.edu.hfuu.iao.collections.Map;

/** a class where we use our map */
public class MapTest {
  /** The main routine 
   *  @param args  we ignore this parameter */
  public static void main(String[] args) {
    Map map = new Map();

    map.put("Hello", "World!");             //$NON-NLS-1$ //$NON-NLS-2$
    System.out.println(map);                // Hello=World!
    
    map.put("Country", "China");            //$NON-NLS-1$ //$NON-NLS-2$
    System.out.println(map);                // Hello=World!, Country=China    
    System.out.println(map.get("Country")); // China //$NON-NLS-1$ 
    System.out.println(map.get("Hello"));   // World //$NON-NLS-1$
    System.out.println(map.get("World!"));  // null, World! is not a key //$NON-NLS-1$  
    
    map.put("Computer Science", "Fun");     //$NON-NLS-1$ //$NON-NLS-2$
    System.out.println(map);                // Hello=World!, Country=China, Computer Science=Fun
    
    // String str = map.get("Hello");       // this does not work
    String str = (String)(map.get("Hello"));// we need to cast //$NON-NLS-1$
    System.out.println(str);                // World!
    
    Object obj1 = str;
    Object obj2 = "You";                    //$NON-NLS-1$
    map.put(obj1, obj2);                    // this is allowed
    System.out.println(map.get(obj1));      // You
  }
}
