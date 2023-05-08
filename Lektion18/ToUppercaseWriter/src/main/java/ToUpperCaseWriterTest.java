import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ToUpperCaseWriterTest {
    //ToUpperCaseWriter writer;
    //ByteArrayOutputStream baos;


    @Test
    public void writeCharTest() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        OutputStreamWriter osw = new OutputStreamWriter(baos);
        ToUpperCaseWriter writer = new ToUpperCaseWriter(osw);
        try (baos; writer) {
            assertEquals("A", writeTest('a'));
        } catch (IOException e) {
            fail("IOException" + e.getMessage());
        }


    }

    @Test
    public void writeCharTestWithNonChar() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        OutputStreamWriter osw = new OutputStreamWriter(baos);
        ToUpperCaseWriter writer = new ToUpperCaseWriter(osw);
        try (baos; writer) {
            assertEquals("1", writeTest('1'));
        } catch (IOException e) {
            fail("IOException" + e.getMessage());
        }
    }

    @Test
    public void asciiLetterToUppercaseTest() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        OutputStreamWriter osw = new OutputStreamWriter(baos);
        ToUpperCaseWriter writer = new ToUpperCaseWriter(osw);
        try (baos; writer) {
            for (int i = 0; i < 128; i++) {
                char c = (char) i;
                if (Character.isLowerCase(c)) {
                    assertEquals(Character.toString(Character.toUpperCase(c)), writeTest(c));
                }
            }
        } catch (IOException e) {
            fail("IOException" + e.getMessage());
        }
    }

    @Test
    public void asciiNonLetterRemainSameTest() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        OutputStreamWriter osw = new OutputStreamWriter(baos);
        ToUpperCaseWriter writer = new ToUpperCaseWriter(osw);
        try (baos; writer) {
            for (int i = 0; i < 128; i++) {
                char c = (char) i;
                if (!Character.isLowerCase(c)) {
                    assertEquals(Character.toString(c), writeTest(c));
                }
            }
        } catch (IOException e) {
            fail("IOException" + e.getMessage());
        }
    }

    public String writeTest(char c) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        OutputStreamWriter osw = new OutputStreamWriter(baos);
        ToUpperCaseWriter writer = new ToUpperCaseWriter(osw);
        writer.write(c);
        writer.flush();

        return baos.toString();
    }

}
