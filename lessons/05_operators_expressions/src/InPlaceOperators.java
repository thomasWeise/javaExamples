/** Examples for in-place operators */
public class InPlaceOperators {

  /** The main routine
   * @param args
   *          we ignore this parameter for now */
  public static final void main(String[] args) {
    int i = 1, j = 5; // declare the two integer variables i and j, where i=1 and j=5
        
    System.out.println(i); // prints 1
    i += j; // add j and i, store result in i, i.e., i=i+j = (1+5)
    System.out.println(i); // prints 6
    j *= i; // multiply j with i, store result in j (j = (j*i) = 6*5
    System.out.println(j); // prints 30
    j /= ++i; // first, add 1 to i (store result in i) and return it, then divide j by it and store in j
    System.out.println(i); // prints 7
    System.out.println(j); // prints 30/7 = 4
    i *= j++; // first, add 1 to j (store result but return old value), then multiply with i and store in i
    System.out.println(j); // prints 4+1 = 5
    System.out.println(i); // prints 7 * 4 = 28
    i |= (j ^= 3); // first do binary xor of j with 3, store in j, then binary or of result with i and store
    System.out.println(j); // prints (5)^3 = (1 | 4) ^ 3 = 2 | 4 = 6
    System.out.println(i); // prints (28) | 6 = (16 | 8 | 4) | 2 = 30
    i *= ((--j) * (i++)) - j; // this is a tough cooky: i = 30 * [((6-1) * 30)) - 5] <-- never do such stuff
    System.out.println(i); // prints 30*145=4350 .. (the final multiplication takes the original i value)
  }
}
