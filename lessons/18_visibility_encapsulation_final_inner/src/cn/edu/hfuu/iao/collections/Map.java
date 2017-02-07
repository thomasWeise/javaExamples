package cn.edu.hfuu.iao.collections;

/** a map which stores key-value relationships */
public final class Map {

  /** the entry list: see the private class Entry below */
  private Entry[] entries;

  /** create a map */
  public Map() {                  // create the map
    this.entries = new Entry[32]; // with space for some entries
  }

  /** store that key should now be related to value */
  public final void put(final Object key, final Object value) {
    for (int index = 0; index < this.entries.length; index++) {     // first check all stored keys
      if (this.entries[index] == null) {                            // if we get here, we have reached the end of the map
        this.entries[index] = new Entry(key, value);                // since we did not find key, just put a new entry
        return; // and we can exit
      }
      if (this.entries[index].key == key) {                         // check if there already is an entry for the specified key
        this.entries[index].value = value;                          // if so, we need to change its associated value
        return;                                                     // and can exit
      }
    } // if we get to after the loop, this means that the entry list is full, but does not contain key
    Entry[] newEntries = new Entry[this.entries.length * 2];        // so we need to allocate a larger entry list
    for(int i = this.entries.length; (--i) >= 0; ) { newEntries[i] = this.entries[i]; } // copy all existing entries
    newEntries[this.entries.length] = new Entry(key, value);        // and at the end of this list, we put the new entry
    this.entries = newEntries;                                      // and store the new entry list
  }

  /** transform to string */
  public final String toString() {
    String string = ""; //$NON-NLS-1$
    for (Entry entry : this.entries) {                              // fast iteration over all entries
      if (entry == null) { return string; }                         // end of list reached
      if (string != "") { string += ", "; } //$NON-NLS-1$ //$NON-NLS-2$
      string += entry.key + "=" + entry.value;                      //add key-value relationship //$NON-NLS-1$
    }
    return string; // return string
  }

  /** an inner class storing a map entry: This class is ONLY visible inside the Map class */
  private static final class Entry {
    /** the key, can never be changed and only accessed from enclosing class */
    final Object key;
    /** the value stored in the entry, can be changed (only from enclosing class) */
    Object value;
    /** create an entry */
    Entry(final Object _key, final Object _value) {
      this.key = _key;
      this.value = _value;
    }
  }
}
