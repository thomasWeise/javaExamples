package cn.edu.hfuu.iao;

import cn.edu.hfuu.iao.collections.GenericPair;

/** a class where we use the GenericPair class inside a generic pair */
public class GenericPairParameterizedParametersTest {

  /** The main routine
   *  @param args we ignore this parameter */
  public static void main(String[] args) {
    GenericPair<String, Integer> stringIntegerPair;
    GenericPair<String, GenericPair<String, Integer>> wrappedPair;

    stringIntegerPair =                           // we can use <> (instead of <String, GenericPair<String, Integer>>)
        new GenericPair<>("int", new Integer(3)); // since the generic parameters are clear //$NON-NLS-1$

    wrappedPair = new GenericPair<>("Hello", stringIntegerPair); //$NON-NLS-1$
    System.out.println(wrappedPair.key);                    // Hello
    System.out.println(wrappedPair.getValue().key);         // int
    System.out.println(wrappedPair.getValue().getValue());  // 3
    
    Integer integer = wrappedPair.getValue().getValue();    // no type case to Integer necessary
    System.out.println(integer);                            // 3

    wrappedPair.getValue().setValue(new Integer(6));        // this only is allowed with Integer
    System.out.println(wrappedPair.getValue().getValue());  // 6

    wrappedPair.setValue(new GenericPair<>("newInt", new Integer(7)));  //$NON-NLS-1$
    System.out.println(wrappedPair.key);                    // Hello
    System.out.println(wrappedPair.getValue().key);         // newInt
    System.out.println(wrappedPair.getValue().getValue());  // 7
  }
}
