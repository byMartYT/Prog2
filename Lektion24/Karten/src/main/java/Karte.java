import java.util.List;

public class Karte
{
    Farbe farbe;
    Wert wert;
    public Karte(Farbe farbe, Wert wert)
    {
        this.farbe = farbe;
        this.wert = wert;
    }

    @Override
    public String toString()
    {
        return farbe + " " + wert;
    }
}
