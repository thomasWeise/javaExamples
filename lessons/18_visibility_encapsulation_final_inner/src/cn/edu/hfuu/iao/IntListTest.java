package cn.edu.hfuu.iao;

import cn.edu.hfuu.iao.collections.IntList;

/** a class where we use int lists */
public class IntListTest {
  /** The main routine
   *  @param args  we ignore this parameter */
  public static void main(String[] args) {
    IntList list;

    list = new IntList(new int[] { 12, 3 }); // create list with contents 12, 3
    System.out.println(list); // prints 12, 3
    list.append(-4);          // appends -4 to the list
    System.out.println(list); // prints 12, 3, -4
    list.reverse();           // reverse list
    System.out.println(list); // print -4, 3, 12
    // list.__copyTo(new int[100]); // this is not possible, __copyTo is not visible
    System.out.println(list.size()); // this is allowed, prints 3
    // System.out.println(list.size); // not allowed, variable size is package private
  }
}
