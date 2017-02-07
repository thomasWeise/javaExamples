package cn.edu.hfuu.iao;

import cn.edu.hfuu.iao.collections.Map;

/** a class where we use our map */
public class MapTest {
  /**
   * The main routine
   * 
   * @param args
   *          we ignore this parameter
   */
  public static void main(String[] args) {
    Map map = new Map();

    map.put("Hello", "World!"); //$NON-NLS-1$ //$NON-NLS-2$
    System.out.println(map); // Hello=World!
    
    map.put("Country", "China"); //$NON-NLS-1$ //$NON-NLS-2$
    System.out.println(map); // Hello=World!, Country=China
    
    map.put("Computer Science", "Fun"); //$NON-NLS-1$ //$NON-NLS-2$
    System.out.println(map); // Hello=World!, Country=China, Computer Science=Fun

    map.put("Hello", "Class!"); //$NON-NLS-1$ //$NON-NLS-2$
    System.out.println(map); // Hello=Class!, Country=China, Computer Science=Fun

    map.put("This Course", "Nice"); //$NON-NLS-1$ //$NON-NLS-2$
    System.out.println(map); // Hello=Class!, Country=China, Computer Science=Fun, This Course=Nice

    map.put("This Course", "so-so"); //$NON-NLS-1$ //$NON-NLS-2$
    System.out.println(map); // Hello=Class!, Country=China, Computer Science=Fun, This Course=so-so
  }
}
