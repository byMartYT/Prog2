public class Main {
    // a -> Objekt Karte, Objekt Spiel, Objekt Spieler
    // b -> Klasse Spieler mit einer Arraylist das Karten enthält


    public static void main(String[] args) {
        Game game = new Game();
        Player p = new Player("Martin");
        game.addPlayer(p);
        Player p2 = new Player("Tom");
        game.addPlayer(p2);
        Player p3 = new Player("Anna");
        game.addPlayer(p3);
        game.genCards();
        game.mixCards();
        game.dealCards();
        p.sortHand();
        p.printHand();
        p2.sortHand();
        p2.printHand();
        p3.sortHand();
        p3.printHand();

    }
}
