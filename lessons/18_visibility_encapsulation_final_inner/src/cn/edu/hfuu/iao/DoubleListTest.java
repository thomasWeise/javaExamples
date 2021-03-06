package cn.edu.hfuu.iao;

import cn.edu.hfuu.iao.collections.DoubleList;

/** a class where we use float lists */
public class DoubleListTest {
  /** The main routine
   *  @param args  we ignore this parameter */
  public static void main(String[] args) {
    DoubleList list;

    list = new DoubleList(new double[] { 12d, 3d }); // create list with contents 12.0, 3.0
    System.out.println(list); // prints 12.0, 3.0
    list.append(-4d);          // appends -4.0 to the list
    System.out.println(list); // prints 12.0, 3.0, -4.0
    list.reverse();           // reverse list
    System.out.println(list); // print -4.0, 3.0, 12.0
    // list.__copyTo(new double[100]); // this is not possible, __copyTo is not visible
    System.out.println(list.size()); // this is allowed, prints 3
    // System.out.println(list.size); // not allowed, variable size is package private
  }
}
