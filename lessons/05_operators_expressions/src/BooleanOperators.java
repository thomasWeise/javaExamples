/** Examples for boolean operators */
public class BooleanOperators {

  /** The main routine
   * @param args
   *          we ignore this parameter for now */
  public static final void main(String[] args) {
    boolean res; // declare boolean variable res
    
    res = false || true; // store false "or" true in variable "res"
    System.out.println(res); // prints true
    res = res && false; // store res "and" false  in variable "res"
    System.out.println(res); // prints false
    res = !res; // store "not" res in variable "res"
    System.out.println(res); // prints true
    res = res ^ res; // store res "xor" res in res
    System.out.println(res); // prints false
  }
}
