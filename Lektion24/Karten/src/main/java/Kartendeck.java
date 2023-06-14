import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Kartendeck {
    List<Karte> karten;

    public void erzeugeDeckFlatmap() {
        karten = Arrays.stream(Farbe.values()).flatMap(f -> Arrays.stream(Wert.values()).map(w -> new Karte(f, w))).collect(Collectors.toList());
    }


    @Override
    public String toString() {
        return karten.stream().map(k -> k.farbe + " " + k.wert).collect(Collectors.joining(", "));
    }

}
