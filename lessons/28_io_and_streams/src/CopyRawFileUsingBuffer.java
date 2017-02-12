import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/** a class copying a raw file by using a buffer: faster */
public class CopyRawFileUsingBuffer {

  /** The main routine 
   *  @param args  args[0]=source file, args[1]=target file */
  public static void main(String[] args) { // we use try-with-resource...
    try (final FileInputStream source = new FileInputStream(args[0])) {
      try (final FileOutputStream target = new FileOutputStream(args[1])) {
        byte[] buffer = new byte[4096]; // a reasonable sized buffer
        int readAmount;                 // the number of bytes actually read

        while ((readAmount = source.read(buffer)) > 0) { // fill buffer
          target.write(buffer, 0, readAmount); // write the bytes we just read
        }
      } // closes target, the "}" in the next line closes source
    } catch (IOException error) { // IOExceptions are checked exceptions
      System.out.println("Copying has failed."); //$NON-NLS-1$
      error.printStackTrace();    // print stack trace
    }
  }
}
