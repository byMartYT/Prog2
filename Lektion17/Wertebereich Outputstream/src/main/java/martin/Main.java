package martin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Main {

    byte[] b = new byte[]{0,1,0,14,4};
    FileOutputStream fos;
    {
        try {
            fos = new FileOutputStream("test.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // byte b darf nicht null sein
    // offset und length dürfen nicht kleiner 0 sein und offset + length nicht größer als b.length sein

    @Test
    public void testInputNegativeValue(){
        assertThrows(IndexOutOfBoundsException.class, () -> fos.write(b, -1, 5));
    }

    @Test
    public void testNullByte(){
        assertThrows(NullPointerException.class, () -> fos.write(null, 1, 5));
    }

    @Test
    public void testInputLengthToBig(){
        assertThrows(IndexOutOfBoundsException.class, () -> fos.write(b, 0, 10));
    }

}