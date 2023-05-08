import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Game {
    ArrayList<Karte> karten = new ArrayList<>();
    ArrayList<Karte> spieldeck = new ArrayList<>();
    Set<Player> player = new HashSet<>();

    private static final int CARD_AMOUNT = 6;

    public void addPlayer(Player p) {
        player.add(p);
    }

    public void genCards(){
        for(Cards.Symbols symbol : Cards.Symbols.values()) {
            for (Cards.Values value : Cards.Values.values()) {
                karten.add(new Karte(value, symbol.getValue()));
            }
        }
    }
    public void mixCards(){
        for(int i = karten.size(); i > 0; i--) {
            spieldeck.add(karten.remove((int) (Math.random()*i)));
        }
    }

    public void dealCards() {
        for (int i = 0; i < CARD_AMOUNT; i++) {
            for(Player p : player) {
                p.karten.add(spieldeck.remove(0));
            }
        }
    }
}
