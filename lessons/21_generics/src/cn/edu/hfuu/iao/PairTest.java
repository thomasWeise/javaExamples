package cn.edu.hfuu.iao;

import cn.edu.hfuu.iao.collections.Pair;

/** a class where we use the Object-based Pair class */
public class PairTest {
  /** The main routine
   *  @param args we ignore this parameter */
  public static void main(String[] args) {
    Pair stringPair = new Pair("Hello", "World!"); //$NON-NLS-1$ //$NON-NLS-2$
    System.out.println(stringPair.key); // Hello
    System.out.println(stringPair.getValue()); // World!

    // Integer is a java utility class, its instance can hold
    Pair stringIntegerPair = new Pair("int", new Integer(3));  //$NON-NLS-1$
    System.out.println(stringIntegerPair.key); // "int"
    System.out.println(stringIntegerPair.getValue()); // 3

    // String keyString = stringPair.key; // not allowed, key could be any Object
    String keyString = (String) (stringPair.key); // we need explicit casting
    System.out.println(keyString); // Hello

    // String valueString = stringPair.getValue(); // not allowed, value could be any object
    String valueString = (String) (stringPair.getValue()); // we need explicit casting
    System.out.println(valueString); // World!
    
    stringIntegerPair = stringPair; // this is allowed
    System.out.println(stringIntegerPair.key);  //  Hello
    System.out.println(stringIntegerPair.getValue()); // World!
  }
}
