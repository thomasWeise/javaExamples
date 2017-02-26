/** A class showing the results of strange integer arithmetic expressions. */
public class StrangeIntegerArithmetic {
  /** The main routine
   * @param args we ignore this parameter for now */
  public static final void main(String[] args) {
    int a = 1000;          // declare int a = 1000 
    System.out.println(a); // print value of a, what do we expect?
    a *= 1000;             // a is now 1000*1000
    System.out.println(a); // print value of a, what do we expect?
    a *= 1000;             // a is now (1000*1000)*1000
    System.out.println(a); // print value of a, what do we expect?
    a *= 1000;             // a is now ((1000*1000)*1000)*1000
    System.out.println(a); // print value of a, what do we expect?
    a /= 1000;             // a is now (((1000*1000)*1000)*1000)/1000
    System.out.println(a); // print value of a, what do we expect?
    a /= 1000;             // a is now ((((1000*1000)*1000)*1000)/1000)/1000
    System.out.println(a); // print value of a, what do we expect?
    a /= 1000;             // a is now (((((1000*1000)*1000)*1000)/1000)/1000)/1000
    System.out.println(a); // print value of a, what do we expect?
  }
}
