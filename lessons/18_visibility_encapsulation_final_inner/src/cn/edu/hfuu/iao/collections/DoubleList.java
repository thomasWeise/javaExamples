package cn.edu.hfuu.iao.collections;

/** A list of double values, based on class List.
 *  Notice how all methods are marked with final so they cannot be overriden. A subclass can only add new methods. */
public class DoubleList extends List {
  /** the actual internal data */
  private double[] data;
  
  /** create an double list based on a data array */
  public DoubleList(double[] _data) {
    this.data = _data;
    this.size = _data.length;
  }
  
  /** copy the data from this list to a destination array */
  private final void __copyTo(final double[] dest) {
   for(int index = this.size; (--index) >= 0; ) {
     dest[index] = this.data[index];
   }
  }
  
  /** add an double value to the list */
  public final void append(final double value) {
    if(this.size >= this.data.length) {      // if capacity limit is reached
      double[] newData = new double[this.size*2];  // allocate a much bigger array to avoid frequent re-allocation
      this.__copyTo(newData);                // copy data to new array
      this.data = newData;                   // remember new array, old value of data becomes subject to GC
    } // after this if-then body, we are sure that the data array is big enough to hold one more element
    this.data[this.size++] = value; // store value at the end of data and increment list length
  }
  

  /** reverse this list */
  @Override
  public final void reverse() { // notice how we use two counters and two counter updates in the loop below
    for(int i = 0, j = this.size-1; i < j; ++i, --j) { // we are allowed to do that, is that cool or what?
      double t = this.data[i];     // copy value at index i
      this.data[i] = this.data[j]; // store value from index j there
      this.data[j] = t;            // now store old value from index i at data[j]
    }
  }
  
  /** Return the array representation of this list.
   *  Notice the usage of double[] instead of Object return value.
   *  We are allowed to do this, because double[] inherits (is subset of) Object. */
  @Override
  public final double[] toArray() {       // transform this list to an double[] array
    double[] res = new double[this.size]; // allocate array of the right size
    this.__copyTo(res);             // use private __copyTo method to copy the contents of list to res
    return res;                     // return res
  }
  
  /** create string representation of list */
  @Override
  public final String toString() {
    String s;
    s = ""; //$NON-NLS-1$
    for(int index = 0; index < this.size; ++index) {
      if(s != "") { s += ", "; } //$NON-NLS-1$ //$NON-NLS-2$
      s += this.data[index];
    }
    return s;
  }
}
