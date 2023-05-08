import java.util.*;

public class Player {

    private final String name;
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

    public void sortHand() {
        Collections.sort(karten);
    }
}

