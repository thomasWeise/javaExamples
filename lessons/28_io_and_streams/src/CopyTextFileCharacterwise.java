import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/** a class copying a text file character by character: slow */
public class CopyTextFileCharacterwise {

  /** The main routine 
   *  @param args  args[0]=source file, args[1]=target file */
  public static void main(String[] args) { // we use try-with-resource...
    try (final FileReader source = new FileReader(args[0])) {
      try (final FileWriter target = new FileWriter(args[1])) {       
        int readCharacter;
        while ((readCharacter = source.read()) >= 0) { // while not end-of-stream
          target.write(readCharacter);        // write the character we just read
        }
      } // closes target, the "}" in the next line closes source
    } catch (IOException error) { // IOExceptions are checked exceptions
      System.out.println("Copying has failed."); //$NON-NLS-1$
      error.printStackTrace();    // print stack trace
    }
  }
}