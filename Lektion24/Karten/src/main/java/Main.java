public class Main {
    static Kartendeck deck = new Kartendeck();

    public static void main(String[] args) {
        deck.erzeugeDeckFlatmap();

        System.out.println(deck);
    }

}
