import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/** a class copying a text file by using a buffer: faster */
public class CopyTextFileUsingBuffer {

  /** The main routine 
   *  @param args  args[0]=source file, args[1]=target file */
  public static void main(String[] args) { // we use try-with-resource...
    try (final FileReader source = new FileReader(args[0])) {
      try (final FileWriter target = new FileWriter(args[1])) { 
        char[] buffer = new char[4096]; // a reasonable sized buffer
        int readAmount;                 // the number of characters actually read

        while ((readAmount = source.read(buffer)) > 0) { // fill buffer
          target.write(buffer, 0, readAmount); // write the characters we just read
        }
      } // closes target, the "}" in the next line closes source
    } catch (IOException error) { // IOExceptions are checked exceptions
      System.out.println("Copying has failed."); //$NON-NLS-1$
      error.printStackTrace();    // print stack trace
    }
  }
}
