package cn.edu.hfuu.iao;

import cn.edu.hfuu.iao.collections.GenericPair;

/** a class where we use wildcards on the GenericPair class and implement a method with generic parameters */
public class GenericsAndStaticFunctionsWildcards {

  /** a static function creating a copy of a pair with possible super key and value types  */
  static <K, V> GenericPair<K, V> copyPair(final GenericPair<? extends K, ? extends V> pair) {
    return new GenericPair<>(pair.key, pair.getValue()); // <> is used, since the generics are clear
  }

  /** a static function checking if two pairs have exactly the same parameters */
  static <K, V> boolean isSame(GenericPair<K, V> pair1, GenericPair<? super K, ? super V> pair2) {
    return ((pair1.key == pair2.key) && (pair1.getValue() == pair2.getValue()));
  }

  /** The main routine 
   *  @param args  we ignore this parameter */
  public static void main(String[] args) {
    GenericPair<String, String> stringPair = new GenericPair<>("Hello", "World!"); //$NON-NLS-1$ //$NON-NLS-2$

    System.out.println(stringPair.key); // Hello
    System.out.println(stringPair.getValue()); // World!

    GenericPair<String, Integer> stringIntegerPair = new GenericPair<>("int", new Integer(3)); //$NON-NLS-1$
    System.out.println(stringIntegerPair.key); // "int"
    System.out.println(stringIntegerPair.getValue()); // 3

    // GenericPair<String, Object> stringObjectPair = stringIntegerPair; <- this is not allowed
    GenericPair<String, Object> stringObjectPair1 = copyPair(stringIntegerPair); // this is allowed
    // GenericPair<String, Object> stringObjectPair = stringPair; <- this is not allowed
    GenericPair<String, Object> stringObjectPair2 = copyPair(stringPair); // this is allowed
    
    System.out.println(isSame(stringPair, stringPair)); // true
    System.out.println(isSame(stringPair, stringObjectPair1)); // true
    System.out.println(isSame(stringPair, stringObjectPair2)); // false
    // System.out.println(isSame(stringObjectPair1, stringPair)); <-- this is not allowed
    // System.out.println(isSame(stringObjectPair2, stringPair)); <-- this is not allowed 
  }
}
