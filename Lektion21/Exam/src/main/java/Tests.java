import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class Tests {

    @Test
    public void testExam() {
        Exam e = new Exam();
        try {
            e.readQuestions();
            e.toTest();
            File f = new File("test.tex");
            assertTrue(f.exists());
        } catch (IOException ex) {
            fail("IOException");
        }
    }
}
