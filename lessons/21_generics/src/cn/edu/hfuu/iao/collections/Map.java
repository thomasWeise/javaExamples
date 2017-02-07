package cn.edu.hfuu.iao.collections;

/** a map which stores key-value relationships */
public final class Map {

  /** the entry list: see the private class Pair below */
  private Pair[] entries;

  /** create a map */
  public Map() {                  // create the map
    this.entries = new Pair[32]; // with space for some entries
  }

  /** store that key should now be related to value */
  public final void put(final Object key, final Object value) {
    for (int index = 0; index < this.entries.length; index++) {     // first check all stored keys
      if (this.entries[index] == null) {                            // if we get here, we have reached the end of the map
        this.entries[index] = new Pair(key, value);                // since we did not find key, just put a new entry
        return; // and we can exit
      }
      if (this.entries[index].key == key) {                         // check if there already is an entry for the specified key
        this.entries[index].setValue(value);                        // if so, we need to change its associated value
        return;                                                     // and can exit
      }
    } // if we get to after the loop, this means that the entry list is full, but does not contain key
    Pair[] newEntries = new Pair[this.entries.length * 2];        // so we need to allocate a larger entry list
    for(int i = this.entries.length; (--i) >= 0; ) { newEntries[i] = this.entries[i]; } // copy all existing entries
    newEntries[this.entries.length] = new Pair(key, value);        // and at the end of this list, we put the new entry
    this.entries = newEntries;                                      // and store the new entry list
  }
  
  /** get the value associated with the given key, or null if nothing is stored under the key */
  public final Object get(final Object key) {
    for (Pair entry : this.entries) {                                // simply iterate over all entries
      if (entry == null) { return null; }                            // we reached the end and found nothing, return null
      if (entry.key == key) { return entry.getValue(); }             // we found an entry with the right key, return the value
    }
    return null;                                                     // we found nothing, let's return null
  }

  /** transform to string */
  public final String toString() {
    String string = ""; //$NON-NLS-1$
    for (Pair entry : this.entries) {                              // fast iteration over all entries
      if (entry == null) { return string; }                         // end of list reached
      if (string != "") { string += ", "; } //$NON-NLS-1$ //$NON-NLS-2$
      string += entry.key + "=" + entry.getValue();                 //add key-value relationship //$NON-NLS-1$
    }
    return string; // return string
  }
}
