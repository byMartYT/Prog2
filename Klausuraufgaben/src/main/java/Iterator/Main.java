package Iterator;

public class Main {

    public static void main(String[] args) {
        RouletteZahlen rz = new RouletteZahlen();

        for(int i : rz) {
            System.out.println(i);
        }

        RouletteZahlenIterator rzi = new RouletteZahlenIterator();

        while(rzi.hasNext()) {
            System.err.println(rzi.next());
        }
    }
}
