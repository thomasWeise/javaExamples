package cn.edu.hfuu.iao.collections;

/**
 * a generic key-value pair where we can specify the types
 * @param <K>   the generic key type
 * @param <V>   the generic value type */
public class GenericPair<K, V> {
  /** the key object */
  public final K key;
  /** the value object */
  private V value;

  /** create */
  public GenericPair(final K _key, final V _value) {
    this.key = _key;
    this.value = _value;
  }

  /** set the value: must be of type V */
  public void setValue(final V _value) {
    this.value = _value;
  }

  /** get the value */
  public V getValue() {
    return this.value;
  }
}
