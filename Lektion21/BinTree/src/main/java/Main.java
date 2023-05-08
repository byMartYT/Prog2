public class Main {

    public static void main(String[] args) {
        BinTree<String> bin = new BinTree<>();

        bin.insert("Martin");
        bin.insert("Anna");
        bin.insert("Niklas");
        bin.insert("Thomas");
        bin.insert("Thomas");
        bin.insert("Stefan");

        bin.print();
    }
}
