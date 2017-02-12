import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/** a class copying a raw file byte for byte: slow */
public class CopyRawFileBytewise {
  /** The main routine 
   *  @param args  args[0]=source file, args[1]=target file */
  public static void main(String[] args) { // we use try-with-resource...
    try (final FileInputStream source = new FileInputStream(args[0])) {
      try (final FileOutputStream target = new FileOutputStream(args[1])) {       
        int readByte;
        while ((readByte = source.read()) >= 0) { // while not end-of-stream
          target.write(readByte);             // write the byte we just read
        }
      } // closes target, the "}" in the next line closes source
    } catch (IOException error) { // IOExceptions are checked exceptions
      System.out.println("Copying has failed."); //$NON-NLS-1$
      error.printStackTrace();    // print stack trace
    }
  }
}

