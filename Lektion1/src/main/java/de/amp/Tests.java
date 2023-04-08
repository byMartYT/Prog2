package de.amp;

import org.junit.jupiter.api.Test;

import static de.amp.Main.berechneKugelvolumen;
import static de.amp.Punkt.*;
import static org.junit.jupiter.api.Assertions.*;

public class Tests {
    @Test
    public void testDouble(){
        assertTrue(0 == berechneKugelvolumen(0));
        assertEquals((4d/3d)*Math.PI, berechneKugelvolumen(1));
        assertEquals((500d/3d)*Math.PI, berechneKugelvolumen(5));
        try {
            berechneKugelvolumen(-1);
            fail("Negative Zahl -> Runtime expected");
        } catch (RuntimeException e) {
            assertEquals("Fehler -> Negative Zahl", e.getMessage());
        }
    }

    @Test
    public void testPunkt(){

    }
}
