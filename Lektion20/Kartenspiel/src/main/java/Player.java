import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Player {

    private String name;
    ArrayList<Karte> karten = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public void printHand() {
        System.out.println(name + " hat folgende Karten auf der Hand");
        for (Karte k : karten) {
            System.out.printf("%-5s %s %n", k.getSymbol() , k.getValue().name());
        }
    }
}
