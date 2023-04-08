package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestPerson {

    @Test
    public void insertUser(){
        Main.start();
    }

    @Test
    public void testOutput(){
        for (int i = 0; i < Main.personen.length; i++) {

            assertEquals("Der Professor unterrichtet Programmieren.", Main.personen[i].gibTaetigkeitAus());

            assertEquals("Der Student besucht das Fach Programmieren.", Main.personen[++i].gibTaetigkeitAus());
        }
    }
}
