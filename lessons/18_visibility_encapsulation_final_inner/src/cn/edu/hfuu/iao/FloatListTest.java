package cn.edu.hfuu.iao;

import cn.edu.hfuu.iao.collections.FloatList;

/** a class where we use double lists */
public class FloatListTest {
  /** The main routine
   *  @param args  we ignore this parameter */
  public static void main(String[] args) {
    FloatList list;

    list = new FloatList(new float[] { 12f, 3f }); // create list with contents 12.0, 3.0
    System.out.println(list); // prints 12.0, 3.0
    list.append(-4f);          // appends -4.0 to the list
    System.out.println(list); // prints 12.0, 3.0, -4.0
    list.reverse();           // reverse list
    System.out.println(list); // print -4.0, 3.0, 12.0
    // list.__copyTo(new float[100]); // this is not possible, __copyTo is not visible
    System.out.println(list.size()); // this is allowed, prints 3
    // System.out.println(list.size); // not allowed, variable size is package private
  }
}
