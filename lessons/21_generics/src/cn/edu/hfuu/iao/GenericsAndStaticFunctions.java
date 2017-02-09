package cn.edu.hfuu.iao;

import cn.edu.hfuu.iao.collections.GenericPair;

/** a class where we use the GenericPair class and implement a method with generic parameters */
public class GenericsAndStaticFunctions {

  /** a static function can have generic parameters as well */
  static <K, V> GenericPair<K, V> makePair(final K key, final V value) {
    return new GenericPair<>(key, value); // <> is used, since the generics are clear
  }

  /** a static function checking if two pairs have exactly the same parameters */
  static <K, V> boolean isSame(GenericPair<K, V> pair1, GenericPair<K, V> pair2) {
    return ((pair1.key == pair2.key) && (pair1.getValue() == pair2.getValue()));
  }

  /** The main routine 
   *  @param args  we ignore this parameter */
  public static void main(String[] args) {
    GenericPair<String, String> stringPair = makePair("Hello", "World!"); //$NON-NLS-1$ //$NON-NLS-2$

    System.out.println(stringPair.key); // Hello
    System.out.println(stringPair.getValue()); // World!

    GenericPair<String, Integer> stringIntegerPair = makePair("int", new Integer(3)); //$NON-NLS-1$
    System.out.println(stringIntegerPair.key); // "int"
    System.out.println(stringIntegerPair.getValue()); // 3

    String keyString = stringPair.key; // we do no longer need need explicit casting
    System.out.println(keyString); // Hello

    String valueString = stringPair.getValue(); // we do no longer need explicit casting
    System.out.println(valueString); // World!

    // integerPair = stringPair; // this is now forbidden

    System.out.println(isSame(stringPair, makePair("Hello", "World!"))); // true //$NON-NLS-1$ //$NON-NLS-2$
    System.out.println(isSame(stringPair, makePair("Hello", "You")));    // false //$NON-NLS-1$ //$NON-NLS-2$
    
    // System.out.println(isSame(stringPair, stringIntegerPair));        // this is forbidden altogether
  }
}
