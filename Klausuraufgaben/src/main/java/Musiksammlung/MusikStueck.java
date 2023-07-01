package Musiksammlung;

public class MusikStueck {
    String titel;     // Name des Musikstueckes
    String interpret; // Gruppe/Saenger des Stueckes
    int laenge;       // Dauer in Sekunden
    public MusikStueck(String titel, String interpret, int laenge)
    {
        this.titel = titel;
        this.interpret = interpret;
        this.laenge = laenge;
    }

    @Override
    public String toString(){
        return new StringBuilder().append("Titel: ").append(titel).append(" Interpret: ").append(interpret).append(" Laenge: ").append(laenge).toString();
    }
}
