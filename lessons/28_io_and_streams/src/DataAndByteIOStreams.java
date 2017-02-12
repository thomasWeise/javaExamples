import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/** a class writing some primitive types to a buffer, printing the buffer, then reading the values again */
public class DataAndByteIOStreams {

  /** The main routine 
   *  @param args  args[0]=target file */
  public static void main(String[] args) { // we use try-with-resource...
    byte[] buffer;

    try { // wrap all code in a huge try-catch clause
      try (ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
        try (DataOutputStream dos = new DataOutputStream(bos)) {
          dos.writeLong(0x88_99_aa_bb_cc_dd_ee_ffL); // write 64bit long to dos, results in 8 bytes to bos
          dos.writeBoolean(true);  // write true to dos, results in byte value 1 to bos
          dos.writeFloat(2f);      // write float 2f to dos, results in 4 bytes (0x40_00_00_00) to bos
          dos.writeInt(8192 | 32); // 8192 | 32 = 0x00002020 to dos, resulting in 4 to bos
        } // automatically close the data output stream
        buffer = bos.toByteArray(); // get a copy of the buffer holding all writtendata
      } // close the byte array output stream

      System.out.print(buffer.length); // how many bytes were written? 8+1+4+4 = 17
      System.out.print(':');
      for (byte b : buffer) { // fast read-only iteration over buffer
        System.out.print(' ');
        System.out.print(Integer.toHexString(b & 0xff)); // write hex value of current byte
      }                     //     ________long___________   __float_ ___int___
      System.out.println(); // 17: 88 99 aa bb cc dd ee ff 1 40 0 0 0 0 0 20 20
                            //                     boolean-^
      try (ByteArrayInputStream bis = new ByteArrayInputStream(buffer)) { // now we read again from the buffer
        try (DataInputStream dis = new DataInputStream(bis)) { // and wrap bis into data input stream
          System.out.println(Long.toHexString(dis.readLong())); // read the long
          System.out.println(dis.readBoolean());                // read the boolean
          System.out.println(dis.readFloat());                  // read the float
          System.out.println(dis.readInt());                    // read the int
        } // automatically close dis
      } // automatically close bis

    } catch (IOException error) { // if something failed (that should really not happen here) ...
      error.printStackTrace();    // ... print the stack trace
    }
  }
}
