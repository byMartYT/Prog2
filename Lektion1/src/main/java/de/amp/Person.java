package de.amp;

public class Person {

    String vorname, nachnahme;
    Adresse adresse;

    public Person(String vorname, String nachnahme, String strasse, String hnr, String ort, int plz) {
        if(!checkLetter(vorname.charAt(0))) throw new RuntimeException("vn");
        this.vorname = vorname;
        this.nachnahme = nachnahme;
        this.adresse = new Adresse(strasse, hnr,ort,plz);
    }

    public static boolean checkLetter(char c) {
        return c > 64 && c < 91;
    }
}

