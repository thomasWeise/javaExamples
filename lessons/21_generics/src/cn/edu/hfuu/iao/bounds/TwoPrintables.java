package cn.edu.hfuu.iao.bounds;

/** a class of two printables is a pair whose elements must be printable */
public class TwoPrintables<T extends Printable> extends Printable {
  /** the first printable */
  private final T a;
  /** the second printable */
  private final T b;
  
  /** create */
  public TwoPrintables(final T _a, final T _b) {
    this.a = _a; this.b = _b;
  }
  
  /** print this object */
  @Override
  public void print() {// since the lower bound for T is Printable, we
    this.a.print();    // can be sure that a and b have a method "print"
    this.b.print();    // and thus we can use it. Without lower bound,
  }                    // this would not have been possible, since class                 
}                      // Object does not have such a method
