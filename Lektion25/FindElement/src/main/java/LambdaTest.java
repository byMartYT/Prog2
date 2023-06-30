import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

public class LambdaTest {

    @Test
    public void testFunktion() {
        assertThrows(FileNotFoundException.class, this::testError);
    }

    public void testError() throws FileNotFoundException{
        throw new FileNotFoundException();
    }

}
