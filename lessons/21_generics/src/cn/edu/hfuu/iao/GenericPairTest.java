package cn.edu.hfuu.iao;

import cn.edu.hfuu.iao.collections.GenericPair;

/** a class where we use the generic Pair class */
public class GenericPairTest {
  /** The main routine
   *  @param args we ignore this parameter */
  public static void main(String[] args) {
    GenericPair<String,String> stringPair = //
             new GenericPair<String,String>("Hello", "World!"); //$NON-NLS-1$ //$NON-NLS-2$
    
    System.out.println(stringPair.key); // Hello
    System.out.println(stringPair.getValue()); // World!

    GenericPair<String,Integer> stringIntegerPair =   // below we can use <> instead of String,Integer
            new GenericPair<>("int", new Integer(3)); // as the generic parameters are clear //$NON-NLS-1$
    System.out.println(stringIntegerPair.key);        // "int"
    System.out.println(stringIntegerPair.getValue()); // 3

    String keyString = stringPair.key; // we do no longer need need explicit casting
    System.out.print(keyString);

    String valueString = stringPair.getValue(); // we do no longer need explicit casting
    System.out.print(valueString);
    
    // integerPair = stringPair; // this is now forbidden
  }
}
