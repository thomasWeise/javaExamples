/** the non-abstract class Circle extends the abstract class Shape */
public class Circle extends Shape {
  /** the radius */
  private int radius;
  
  /** create the circle*/
  public Circle(final int r) {
    this.radius = r;
  }
  
  /** print the circle */
  public void print() {    
    int range = 2 * this.radius;    
    for(int i = 0; i < range; i++) {
      for(int j = 0; j < range; j++) {
        System.out.print(
            ((int)(0.5d + Math.hypot(i-this.radius, j-this.radius))) < this.radius 
            ? '#' : ' ');
      }
      System.out.println();
    }
  }
  /** The main routine 
   *  @param args  we ignore this parameter */
  public static void main(String[] args) {
    Shape circle = new Circle(11); // We can store Circles in Shape variables
    circle.print();                // and invoke the print method
  }
}
