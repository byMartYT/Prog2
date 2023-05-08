public class Main {
    // a -> Objekt Karte, Objekt Spiel, Objekt Spieler
    // b -> Klasse Spieler mit einer Arraylist das Karten enthält


    public static void main(String[] args) {
        Game game = new Game();
        Player p = new Player("Martin");
        game.addPlayer(p);
        game.genCards();
        game.mixCards();
        game.dealCards();
        p.printHand();

    }
}
