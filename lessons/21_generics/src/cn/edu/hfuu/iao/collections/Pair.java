package cn.edu.hfuu.iao.collections;

/** a key-value pair */
public class Pair {
  /** the key object */
  public final Object key;
  /** the value object */
  private Object value;

  /** create */
  public Pair(final Object _key, final Object _value) {
    this.key = _key;
    this.value = _value;
  }

  /** set the value */
  public void setValue(final Object _value) {
    this.value = _value;
  }

  /** get the value */
  public Object getValue() {
    return this.value;
  }
}
