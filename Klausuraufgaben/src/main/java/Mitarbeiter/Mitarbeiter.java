package Mitarbeiter;

import java.io.Serializable;

public class Mitarbeiter implements Serializable {
    private String vorname;
    private String nachname;
    private int nummer;
    private transient int gehalt;

    public Mitarbeiter(String vorname, String nachname, int nummer, int gehalt) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.nummer = nummer;
        this.gehalt = gehalt;
    }//endconstructor

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public int getNummer() {
        return nummer;
    }

    public int getGehalt() {
        return gehalt;
    }
    @Override
    public String toString() {
        return "Nachname: " + nachname + " Vorname: " + vorname + " Personalnummer: " + nummer + " Gehalt: " + gehalt;
    }//endmethod toString

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        return result;
    }//endmethod hashcode

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Mitarbeiter)) {
            return false;
        }
        Mitarbeiter other = (Mitarbeiter) obj;
        if (gehalt != other.gehalt) {
            return false;
        }
        return false;
    }//endmethod equals


}//endclass Mitarbeiter
