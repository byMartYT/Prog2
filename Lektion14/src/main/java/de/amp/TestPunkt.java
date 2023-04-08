package de.amp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestPunkt {

    Punkt p1 = new Punkt();

    @Test
    public void testKorrekt(){
        try {
            p1.verschiebePunkt(202,200);
        } catch (Exception e) {
            fail("Kein Fehler erwartet");
        }
    }
    @Test
    public void testXNeg(){
        try {
            p1.verschiebePunkt(-202,200);
            fail("Fehler erwartet");
        } catch (RuntimeException e) {
            assertEquals("x oder y kleiner 0", e.getMessage());
        }
    }
    @Test
    public void testXGross(){
        try {
            p1.verschiebePunkt(20002,200);
            fail("Fehler erwartet");
        } catch (RuntimeException e) {
            assertEquals("x oder y zu groß", e.getMessage());
        }
    }
    @Test
    public void testYNegXNeg(){
        try {
            p1.verschiebePunkt(-202,-200);
            fail("Fehler erwartet");
        } catch (RuntimeException e) {
            assertEquals("x oder y kleiner 0", e.getMessage());
        }
    }
}
