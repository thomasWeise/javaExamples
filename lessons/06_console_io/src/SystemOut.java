/** Examples for using System.out */
public class SystemOut {
  /**
   * The main routine
   * 
   * @param args
   *          we ignore this parameter for now
   */
  public static final void main(String[] args) {    
    System.out.println("This text is printed and afterwards, a new line is started."); //$NON-NLS-1$
    System.out.println(34); // just write a number and start a new line
    
    System.out.print("Here, we write the integer value "); // no new line afterwards! //$NON-NLS-1$
    System.out.print((Integer.MAX_VALUE / Short.MAX_VALUE) / Byte.MAX_VALUE);
    System.out.print(" and then \""); //$NON-NLS-1$
    double a=0.66d/3d;
    System.out.print(a>0.25d ? "bla" : "blubb"); //$NON-NLS-1$ //$NON-NLS-2$
    System.out.print("\", the result of the expression '"); //$NON-NLS-1$
    System.out.print(a);
    System.out.println(">0.25d ? \"bla\" : \"blubb\"'."); //$NON-NLS-1$
    System.out.println("Here we just print some empty lines:");// new line afterwards //$NON-NLS-1$
    System.out.println(); // another new (empty) line
    System.out.println(); // another new (empty) line
    System.out.println("...and that's all.");//$NON-NLS-1$
  }
}
