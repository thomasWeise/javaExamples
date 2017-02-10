/** an interface for string functions */
public interface StringFunction {

  /** compute the result of the string function for a given input
   * @param in the input string
   * @return the result of the string function */
  public String compute(final String in);
  
  /** a static function which maps all the strings in an array and
   *  prints them
   * @param strings the strings
   * @param func the mapper function
   */
  public static void mapAndPrint(String[] strings, StringFunction func) {
    for(String string : strings) { // fast read-only iteration over array
      System.out.print(func.compute(string)); // print function result
      System.out.print(' ');                  // print space
    }
  }
}
