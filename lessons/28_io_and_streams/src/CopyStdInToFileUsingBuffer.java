import java.io.FileOutputStream;
import java.io.IOException;

/** a class copying all bytes read from stdin to a file by using a buffer: faster */
public class CopyStdInToFileUsingBuffer {

  /** The main routine 
   *  @param args  args[0]=target file */
  public static void main(String[] args) { // we use try-with-resource...
    try (final FileOutputStream target = new FileOutputStream(args[0])) {
      byte[] buffer = new byte[4096]; // a reasonable sized buffer
      int readAmount;                 // the number of bytes actually read

      while ((readAmount = System.in.read(buffer)) > 0) { // fill buffer
        target.write(buffer, 0, readAmount); // write the bytes we just read
      }
    } catch (IOException error) { // IOExceptions are checked exceptions
      System.out.println("Copying has failed."); //$NON-NLS-1$
      error.printStackTrace(); // print stack trace
    }
  }
}
