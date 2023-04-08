package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestClass {

    Wesen mensch = new Mensch();
    Wesen rob = new Roboter();
    Wesen cyborg = new Cyborg();

    @Test
    public void testMensch() {
        Entscheidung e = mensch.entscheide(Gefahr.GEFAHR_VORNE);
        Entscheidung e2 = mensch.entscheide(Gefahr.GEFAHR_VORNE);
        Entscheidung e3 = mensch.entscheide(Gefahr.GEFAHR_LINKS);
        Entscheidung e4 = mensch.entscheide(Gefahr.GEFAHR_RECHTS);
        assertTrue(Entscheidung.BREMSEN.equals(e) || Entscheidung.UNENTSCHIEDEN.equals(e));
        assertTrue(Entscheidung.BREMSEN.equals(e2) || Entscheidung.UNENTSCHIEDEN.equals(e2));
        assertTrue(Entscheidung.RECHTS.equals(e3) || Entscheidung.UNENTSCHIEDEN.equals(e3));
        assertTrue(Entscheidung.LINKS.equals(e4) || Entscheidung.UNENTSCHIEDEN.equals(e4));
    }
    @Test
    public void testRob() {
        Entscheidung e = rob.entscheide(Gefahr.GEFAHR_VORNE);
        Entscheidung e2 = rob.entscheide(Gefahr.GEFAHR_VORNE);
        Entscheidung e3 = rob.entscheide(Gefahr.GEFAHR_LINKS);
        Entscheidung e4 = rob.entscheide(Gefahr.GEFAHR_RECHTS);
        assertEquals(Entscheidung.BREMSEN,(e));
        assertEquals(Entscheidung.BREMSEN,(e2));
        assertEquals(Entscheidung.RECHTS,(e3));
        assertEquals(Entscheidung.LINKS,(e4));
    }
    @Test
    public void testCyborg() {
        Entscheidung e = cyborg.entscheide(Gefahr.GEFAHR_VORNE);
        Entscheidung e2 = cyborg.entscheide(Gefahr.GEFAHR_VORNE);
        Entscheidung e3 = cyborg.entscheide(Gefahr.GEFAHR_LINKS);

        Entscheidung e4 = cyborg.entscheide(Gefahr.GEFAHR_RECHTS);
        assertTrue(Entscheidung.BREMSEN.equals(e) || Entscheidung.UNENTSCHIEDEN.equals(e));
        assertTrue(Entscheidung.BREMSEN.equals(e2) || Entscheidung.UNENTSCHIEDEN.equals(e2));
        assertTrue(Entscheidung.RECHTS.equals(e3) || Entscheidung.UNENTSCHIEDEN.equals(e3));
        assertTrue(Entscheidung.LINKS.equals(e4) || Entscheidung.UNENTSCHIEDEN.equals(e4));
    }


}
