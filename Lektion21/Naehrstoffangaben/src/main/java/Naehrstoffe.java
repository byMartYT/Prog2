public class Naehrstoffe {
    private double portionsgroesse, eiweiss, fett, kohlenhydrate, natrium;
    private int anzahlPortionen;

    public Naehrstoffe(double portionsgroesse, int anzahlPortionen) {
        this.portionsgroesse = portionsgroesse;
        this.anzahlPortionen = anzahlPortionen;
    }

    public Naehrstoffe withEiweiss(double eiweiss) {
        this.eiweiss = eiweiss;
        return this;
    }

    public Naehrstoffe withFett(double fett) {
        this.fett = fett;
        return this;
    }

    public Naehrstoffe withKohlenhydrate(double kohlenhydrate) {
        this.kohlenhydrate = kohlenhydrate;
        return this;
    }

    public Naehrstoffe withNatrium(double natrium) {
        this.natrium = natrium;
        return this;
    }
}
