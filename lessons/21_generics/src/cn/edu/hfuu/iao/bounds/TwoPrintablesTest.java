package cn.edu.hfuu.iao.bounds;

/** a class where we use the printables with lower type bounds */
public class TwoPrintablesTest {
  /** The main routine
   *  @param args we ignore this parameter */
  public static void main(String[] args) {
    FunnyPrintable funny = new FunnyPrintable();
    MathPrintable  math1 = new MathPrintable(1);
    MathPrintable  math2 = new MathPrintable(2);
    
    funny.print(); // Whats the object-oriented way to become wealthy? Inheritance
    math1.print(); // 1
    math2.print(); // 2
    
    TwoPrintables<Printable> two1 = new TwoPrintables<>(funny, math1);
    two1.print(); // Whats the object-oriented way to become wealthy? Inheritance\n1
    
    TwoPrintables<MathPrintable> two2 = new TwoPrintables<>(math1, math2);
    two2.print(); // 1 \n 2
    
    // TwoPrintables<MathPrintable> two2 = new TwoPrintables<>(math1, funny); // not allowed
    
    TwoPrintables<TwoPrintables<MathPrintable>> four = new TwoPrintables<>(
        new TwoPrintables<>(new MathPrintable(1), new MathPrintable(2)),
        new TwoPrintables<>(new MathPrintable(3), new MathPrintable(4)));
    four.print(); // 1\n\2\n\3\n\4
  }
}
