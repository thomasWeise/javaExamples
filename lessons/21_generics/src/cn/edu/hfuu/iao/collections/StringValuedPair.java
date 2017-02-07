package cn.edu.hfuu.iao.collections;

/**
 * a generic key-value pair where we can specify the key type but have String values
 * @param <K>
 *          the generic key type
 */
public class StringValuedPair<K> extends GenericPair<K, String> {

  /** create */
  public StringValuedPair(final K _key, final String _value) {
    super(_key, _value);
  }

  /** get the value */
  @Override
  public String getValue() {
    return '\'' + super.getValue() + '\'';
  }
}
