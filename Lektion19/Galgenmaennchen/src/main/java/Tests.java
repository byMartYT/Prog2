import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Tests {

    ServerGame g;

    @BeforeEach
    public void init() {
        g = new ServerGame();
        g.word = "hallotest";
    }

    @Test
    public void testBuchstabenanzahl() {
        assertEquals("_________", g.handleWord());
    }

    @Test
    public void testFirstBuchstabe() {
        g.rightChars.add('l');
        assertEquals("__ll_____", g.handleWord());
        g.rightChars.add('l');
        assertEquals("__ll_____", g.handleWord());
        g.rightChars.add('o');
        assertEquals("__llo____", g.handleWord());
        g.rightChars.add('t');
        assertEquals("__llot__t", g.handleWord());
    }
}
