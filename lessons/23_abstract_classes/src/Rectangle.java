/** the non-abstract class Rectangle extends the abstract class Shape */
public class Rectangle extends Shape {
  /** the width */
  private int width;
  /** the height */
  private int height;
  
  /** create the rectangle */
  public Rectangle(final int w, final int h) {
    this.width = w; this.height = h;
  }
  
  /** print the rectangle */
  public void print() {
    for(int i = 0; i < this.height; i++) {
      for(int j = 0; j < this.width; j++) {
        System.out.print('#');
      }
      System.out.println();
    }
  }
  /** The main routine 
   *  @param args  we ignore this parameter */
  public static void main(String[] args) {
    Shape rectangle = new Rectangle(10, 5); // We can store Rectangles in Shape variables
    rectangle.print();                      // and invoke the print method
  }
}
