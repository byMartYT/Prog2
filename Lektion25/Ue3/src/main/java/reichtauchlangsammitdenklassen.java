import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.ThrowingConsumer;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class reichtauchlangsammitdenklassen {

    //Schreiben Sie einen geeigneten JUnit 5 Test, der ihr ThrowingConsumer-Interface testet.
    @Test
    public void testThrowingConsumer() {
        ThrowingFunction<String> throwingConsumer = s -> {
            throw new Exception("Test");
        };
        assertThrows(RuntimeException.class, () -> throwingConsumer.accept("Test"));
    }
}
