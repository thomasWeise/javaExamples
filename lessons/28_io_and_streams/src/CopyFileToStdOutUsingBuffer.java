import java.io.FileInputStream;
import java.io.IOException;

/** a class copying a raw file to stdout by using a buffer: faster */
public class CopyFileToStdOutUsingBuffer {

  /** The main routine 
   *  @param args  args[0]=source file */
  public static void main(String[] args) { // we use try-with-resource...
    try (final FileInputStream source = new FileInputStream(args[0])) {
      byte[] buffer = new byte[4096]; // a reasonable sized buffer
      int readAmount; // the number of bytes actually read

      while ((readAmount = source.read(buffer)) > 0) { // fill buffer
        System.out.write(buffer, 0, readAmount); // write the bytes we just read
      }
    } catch (IOException error) { // IOExceptions are checked exceptions
      System.out.println("Copying has failed."); //$NON-NLS-1$
      error.printStackTrace(); // print stack trace
    }
  }
}
