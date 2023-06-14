import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class Kreuzwortraetsel {

    //Implementieren Sie einen Comparator, der es ermöglicht, die Wörter des Kreuzworträtsels zunächst der Länge nach und bei gleicher Länger nach dem Alphabet zu sortieren.
    //Verwenden Sie dazu die Klasse TreeSet.
    //Die Ausgabe soll wie folgt aussehen:
    //Beil
    //Bein

    static String[] alleWoerter = {"Bienenschwarm", "Buch", "Bibel",
            "Beige", "Barriere", "Bein", "Beil", "Christ", "Christian", "Carmen"};

    public static void main(String[] args) {
        TreeSet<String> t = new TreeSet<>((String o1, String o2) -> {
            if (o1.length() < o2.length()) return -1;
            else if (o1.length() > o2.length()) return 1;
            else return o1.compareTo(o2);
        });
        t.addAll(Arrays.asList(alleWoerter));
        for (String wort : t) System.out.println(wort);
    }

}
