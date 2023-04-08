package de.amp;

public class Adresse {
    String strasse, hausnummer, ort;
    int plz;

    public Adresse(String strasse, String hausnummer, String ort, int plz) {
        if(!Person.checkLetter(strasse.charAt(0)) || !Person.checkLetter(ort.charAt(0))) throw new RuntimeException("Großbuchstabe");
        if(!checkNumber(hausnummer.charAt(0))) throw new RuntimeException("hnr");
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.ort = ort;
        this.plz = plz;
    }

    public boolean checkNumber(char c) {
        return c > 48 && c < 58;
    }
}
