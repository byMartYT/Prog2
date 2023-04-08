package org.example;

import java.util.Date;

public class Abteilungsleiter extends Angestellter{

    public Abteilungsleiter(String vorname, String nachname, String id, double grundgehalt, Date geburtsdatum) {
        super(vorname, nachname, id, grundgehalt, geburtsdatum);
        gehaltsfaktor = 2.0;
    }

    public void befoerdern(Angestellter a) {
        a.gehaltsfaktor *= 1.1;
    }
}
