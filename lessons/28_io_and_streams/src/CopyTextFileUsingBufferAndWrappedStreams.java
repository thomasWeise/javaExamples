import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/** a class copying a text file by using character streams wrapped around byte streams */
public class CopyTextFileUsingBufferAndWrappedStreams {

  /** The main routine 
   *  @param args  args[0]=source file, args[1]=target file */
  public static void main(String[] args) { // we use try-with-resource...
    
    try (final FileInputStream fis = new FileInputStream(args[0])) {
      try (final InputStreamReader source = new InputStreamReader(fis)) {
        
        try (final FileOutputStream fos = new FileOutputStream(args[1])) {
          try (final OutputStreamWriter target = new OutputStreamWriter(fos)) {
            
            char[] buffer = new char[4096]; // a reasonable sized buffer
            int readAmount; // the number of characters actually read

            while ((readAmount = source.read(buffer)) > 0) { // fill buffer
              target.write(buffer, 0, readAmount); // write the characters we just read
            }
          }        
        }
      }
    } catch (IOException error) { // IOExceptions are checked exceptions
      System.out.println("Copying has failed."); //$NON-NLS-1$
      error.printStackTrace(); // print stack trace
    }
  }
}
