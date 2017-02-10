/** An interface extending StringFunction by an additional function */
public interface InvertibleStringFunction extends StringFunction {

  /** get a string function which is the inverse of this one, i.e.,
   * if this function maps "A" to "B", the resulting function should
   * map "B" to "A" */
  public StringFunction invert();
}
