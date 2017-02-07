package cn.edu.hfuu.iao.collections;

/** a list of integer values, based on class List */
public class IntList extends List {
  /** the actual internal data */
  private int[] data;
  
  /** create an int list based on a data array */
  public IntList(int[] _data) {
    this.data = _data;
    this.size = _data.length;
  }
  
  /** copy the data from this list to a destination array */
  private void __copyTo(final int[] dest) {
   for(int index = this.size; (--index) >= 0; ) {
     dest[index] = this.data[index];
   }
  }
  
  /** add an integer value to the list */
  public void append(final int value) {
    if(this.size >= this.data.length) {      // if capacity limit is reached
      int[] newData = new int[this.size*2];  // allocate a much bigger array to avoid frequent re-allocation
      this.__copyTo(newData);                // copy data to new array
      this.data = newData;                   // remember new array, old value of data becomes subject to GC
    } // after this if-then body, we are sure that the data array is big enough to hold one more element
    this.data[this.size++] = value; // store value at the end of data and increment list length
  }
  

  /** reverse this list */
  @Override
  public void reverse() { // notice how we use two counters and two counter updates in the loop below
    for(int i = 0, j = this.size-1; i < j; ++i, --j) { // we are allowed to do that, is that cool or what?
      int t = this.data[i];        // copy value at index i
      this.data[i] = this.data[j]; // store value from index j there
      this.data[j] = t;            // now store old value from index i at data[j]
    }
  }
  
  /** Return the array representation of this list.
   *  Notice the usage of int[] instead of Object return value.
   *  We are allowed to do this, because int[] inherits (is subset of) Object. */
  @Override
  public int[] toArray() {          // transform this list to an int[] array
    int[] res = new int[this.size]; // allocate array of the right size
    this.__copyTo(res);             // use private __copyTo method to copy the contents of list to res
    return res;                     // return res
  }
  
  /** create string representation of list */
  @Override
  public String toString() {
    String s;
    s = ""; //$NON-NLS-1$
    for(int index = 0; index < this.size; ++index) {
      if(s != "") { s += ", "; } //$NON-NLS-1$ //$NON-NLS-2$
      s += this.data[index];
    }
    return s;
  }
}
