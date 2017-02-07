package cn.edu.hfuu.iao.collections;

/** a map which stores key-value relationships of keys and values of specific types
 * @param <K> the generic key type
 * @param <V> the generic value type*/
public final class GenericMap<K, V> {

  /** the entry list: see the private class GenericPair below */
  private GenericPair<K,V>[] entries;

  /** create a map */
  @SuppressWarnings("unchecked")
  public GenericMap() {              // create the map
    this.entries = new GenericPair[32]; // with space for some entries
  }

  /** store that key should now be related to value */
  @SuppressWarnings("unchecked")
  public final void put(final K key, final V value) {               // we here use the generic types K and V
    for (int index = 0; index < this.entries.length; index++) {     // first check all stored keys
      if (this.entries[index] == null) {                            // if we get here, we have reached the end of the map
        this.entries[index] = new GenericPair<>(key, value);              // since we did not find key, just put a new entry
        return; // and we can exit
      }
      if (this.entries[index].key == key) {                         // check if there already is an entry for the specified key
        this.entries[index].setValue(value);                          // if so, we need to change its associated value
        return;                                                     // and can exit
      }
    } // if we get to after the loop, this means that the entry list is full, but does not contain key
    GenericPair<K, V>[] newEntries = new GenericPair[this.entries.length * 2];  // so we need to allocate a larger entry list
    for(int i = this.entries.length; (--i) >= 0; ) { newEntries[i] = this.entries[i]; } // copy all existing entries
    newEntries[this.entries.length] = new GenericPair<>(key, value);      // and at the end of this list, we put the new entry
    this.entries = newEntries;                                      // and store the new entry list
  }
  
  /** get the value associated with the given key, or null if nothing is stored under the key */
  public final V get(final K key) {
    for (GenericPair<K,V> entry : this.entries) {                    // simply iterate over all entries
      if (entry == null) { return null; }                            // we reached the end and found nothing, return null
      if (entry.key == key) { return entry.getValue(); }             // we found an entry with the right key, return the value
    }
    return null;                                                     // we found nothing, let's return null
  }

  /** transform to string */
  public final String toString() {
    String string = ""; //$NON-NLS-1$
    for (GenericPair<K, V> entry : this.entries) {                   // fast iteration over all entries
      if (entry == null) { return string; }                          // end of list reached
      if (string != "") { string += ", "; } //$NON-NLS-1$ //$NON-NLS-2$
      string += entry.key + "=" + entry.getValue();                 //add key-value relationship //$NON-NLS-1$
    }
    return string; // return string
  }
}
