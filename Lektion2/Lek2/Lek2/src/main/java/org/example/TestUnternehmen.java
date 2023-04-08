package org.example;

import org.junit.jupiter.api.Test;

import javax.management.openmbean.TabularType;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
public class TestUnternehmen {

    @Test
    public void testInsertMA() {
        Main.abteilungen.add(new Abteilung());
        Main.abteilungen.get(0).mitarbeiter.add(new Angestellter("Thomas", "Fries", "123", 1000, new Date(2002,02,22)));
        assertEquals(1.0, Main.abteilungen.get(0).mitarbeiter.get(0).getGehaltsfaktor());
    }
    @Test
    public void testInsertAL(){

        Main.abteilungen.get(0).mitarbeiter.add(new Abteilungsleiter("Thomas", "Abteilungsleiter", "456", 1500, new Date(2002,02,22)));
        assertEquals(2.0, Main.abteilungen.get(0).mitarbeiter.get(1).getGehaltsfaktor());
    }
    @Test
    public void testFalseFind() {
        Main.abteilungen.add(new Abteilung());
        assertEquals(-1,Main.abteilungen.get(0).findMA("Hans"));
    }

    @Test
    public void testFind() {
        Main.abteilungen.get(0).mitarbeiter.add(new Angestellter("Thomas", "Fries", "123", 1000, new Date(2002,02,22)));
        Main.abteilungen.get(0).mitarbeiter.add(new Abteilungsleiter("Thomas", "Abteilungsleiter", "456", 1500, new Date(2002,02,22)));
        assertEquals(0, Main.abteilungen.get(0).findMA("Fries"));
        assertEquals(1, Main.abteilungen.get(0).findMA("Abteilungsleiter"));
    }

    @Test
    public void testBefoerderung(){
        int person = Main.abteilungen.get(0).findMA("Fries");
        double gehaltAlt = Main.abteilungen.get(0).mitarbeiter.get(person).getGehaltsfaktor();
        //Main.abteilungen.get(0).mitarbeiter.get(1).befoerdern(Main.abteilungen.get(0).mitarbeiter.get(person));
    }



}
