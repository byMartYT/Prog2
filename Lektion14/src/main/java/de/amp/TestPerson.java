package de.amp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestPerson {

    @Test
    public void testKorrekt(){
        try {
            Person p1 = new Person("Martin", "Kinder", "Test", "5B", "Wü", 76767);
            assertEquals("Martin", p1.vorname);
            assertEquals("Kinder", p1.nachnahme);
            assertEquals("Test", p1.adresse.strasse);
            assertEquals("5B", p1.adresse.hausnummer);
            assertEquals("Wü", p1.adresse.ort);
            assertEquals(76767, p1.adresse.plz);
        } catch (Exception e) {
            fail("Kein Fehler erwartet");

        }
    }

    @Test
    public void testVKlein() {
        try {
            Person p1 = new Person("martin", "Kinder", "Test", "5B", "Wü", 76767);
            fail("Runtime erwartet");
        } catch (RuntimeException e) {
            assertEquals("vn", e.getMessage());
        }
    }
    @Test
    public void testHnFalsch() {
        try {
            Person p1 = new Person("Martin", "Kinder", "Test", "C5B", "Wü", 76767);
            fail("Runtime erwartet");
        } catch (RuntimeException e) {
            assertEquals("hnr", e.getMessage());
        }
    }
    @Test
    public void testStlein() {
        try {
            Person p1 = new Person("Martin", "Kinder", "sTest", "5B", "Wü", 76767);
            fail("Runtime erwartet");
        } catch (RuntimeException e) {
            assertEquals("Großbuchstabe", e.getMessage());
        }
    }
    @Test
    public void testOrtklein() {
        try {
            Person p1 = new Person("Martin", "Kinder", "Test", "5B", "wü", 76767);
            fail("Runtime erwartet");
        } catch (RuntimeException e) {
            assertEquals("Großbuchstabe", e.getMessage());
        }
    }

}
