package de.amp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestStrecke {
    @Test
    public void testInsert() {
        Strecke s1 = new Strecke(1, 3);
        Strecke s2 = new Strecke(5, 3);
        assertTrue(1 == s1.getA());
        assertTrue(3 == s2.getA());
    }

    @Test
    public void testUeberschneidung() {
        Strecke s1 = new Strecke(3, 7);
        Strecke s2 = new Strecke(1, 3);
        assertFalse(s1.checkUeberschneidung(s2));

        Strecke s3 = new Strecke(7, 8);
        assertFalse(s1.checkUeberschneidung(s3));

        for (int i = s1.getA()-1; i <= s1.getB()-1; i++) {
            for (int j = s1.getA()+1; j <= s1.getB()+1; j++) {
                if(i==j) continue;
                assertTrue(s1.checkUeberschneidung(new Strecke(i, j)));
            }
        }
    }

    @Test
    public void testToString() {
        Strecke s1 = new Strecke(2, 8);
        assertEquals("2------8", s1.toString());
    }
}
