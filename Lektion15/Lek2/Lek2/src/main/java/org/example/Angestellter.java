package org.example;

import java.util.Date;

public class Angestellter {

    protected String vorname, nachname, id;
    protected double grundgehalt, gehaltsfaktor;

    protected Date geburtsdatum;

    public Angestellter(String vorname, String nachname, String id, double grundgehalt, Date geburtsdatum) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.id = id;
        this.grundgehalt = grundgehalt;
        this.gehaltsfaktor = 1.0;
        this.geburtsdatum = geburtsdatum;
    }

    public boolean isEqual(String nachname) {
        return nachname.equalsIgnoreCase(this.nachname);
    }

    public double getGehaltsfaktor() {
        return gehaltsfaktor;
    }

}
