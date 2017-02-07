package cn.edu.hfuu.iao;

import cn.edu.hfuu.iao.collections.GenericPair;
import cn.edu.hfuu.iao.collections.StringValuedPair;

/** a class where we use the string-valued generic Pair class */
public class StringValuedPairTest {
  /** The main routine
   *  @param args we ignore this parameter */
  public static void main(String[] args) {
    GenericPair<String,String> stringPair = // StringValuedPair is compatible
             new StringValuedPair<String>("Hello", //$NON-NLS-1$ 
                                          "World!"); //$NON-NLS-1$ 
    
    System.out.println(stringPair.key); // Hello
    System.out.println(stringPair.getValue()); // 'World!'
  }
}
