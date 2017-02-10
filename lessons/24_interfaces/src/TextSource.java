/** an interface allowing us to read some text */
public interface TextSource {
  /** read a single character, returning -1 if no more text is available */
  public int readChar();

  /** read a full line of text, returns a non-empty string or, if there is no
   *  more text, {@code null} */
  public default String readLine() {
    int chr;

    String line = "";//$NON-NLS-1$

    for (;;) {                         // repeat until we got a line
      switch (chr = this.readChar()) { // read the next character (into variable chr)
        case '\n':                     // newline
        case '\r': {                   // (used in windows \r\n)
          line = line.trim();          // remove leading and trailing spaces
          if (line.length() <= 0) {    // if line is empty,
            continue;                  // then let's try again (deal with \r\n)
          }                            // otherwise...
        }                              // no return/break: fall-through to handling -1

        //$FALL-THROUGH$               // falling through from above
        case -1: {                     // -1 means we have reached the end of the text
          return (line.length() <= 0) ? null : line; // if line is empty, return null
        }                              // otherwise return line. null only happens at end

        default: {                     // if we get here, there was neither \r, \n\ nor -1
          line += ((char) chr);        // so we add the character we read to the line
        }
      }
    }
  }
}
