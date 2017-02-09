package cn.edu.hfuu.iao.bounds;

/** a funny printable */
public class MathPrintable extends Printable {
  /** the integer */
  private final int number;
  
  public MathPrintable(int _number) { this.number = _number; }
  
  /** print this object */
  @Override
  public void print() {
    System.out.println(this.number);
  }
}
