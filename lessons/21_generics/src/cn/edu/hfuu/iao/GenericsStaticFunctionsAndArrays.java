package cn.edu.hfuu.iao;

/** a class where we use a generic array */
public class GenericsStaticFunctionsAndArrays {

  /** replace the element at index {@code index} in {@code array} with {@code replace}
   *  and return the old element that was stored there before */
  static <T> T replaceAndGetOld(T[] array, int index, final T replace) {
    T old        = array[index];
    array[index] = replace;
    return old;
  }

  /** The main routine 
   *  @param args  we ignore this parameter */
  public static void main(String[] args) {
    String[] list = {"Hello ", "World, ", //$NON-NLS-1$ //$NON-NLS-2$
                      "it's ", "me."};    //$NON-NLS-1$ //$NON-NLS-2$
    
    for(String s : list) { System.out.print(s); }
    System.out.println(); // Hello World, it's me
    
    String old = replaceAndGetOld(list, 3, "someone else."); //$NON-NLS-1$
    System.out.println(old); // me.
    
    for(String s : list) { System.out.print(s); }
    System.out.println(); // Hello World, it's someone else.
  }
}
