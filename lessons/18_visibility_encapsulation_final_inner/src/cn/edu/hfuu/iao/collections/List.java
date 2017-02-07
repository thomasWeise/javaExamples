package cn.edu.hfuu.iao.collections;

/** a base class for lists: public API but package private constructor */
public class List {

  /** package private variable holding list length */
  int size;

  /** package private constructor: only we can derive subclasses */
  List() {
    super();
  }

  /** get the size of this list */
  public int size() {
    return this.size;
  }

  /** reverse this list */
  public void reverse() { // do nothing yet
  }
  
  /** return array representation of this list */
  public Object toArray() {
    return null;
  }
}
