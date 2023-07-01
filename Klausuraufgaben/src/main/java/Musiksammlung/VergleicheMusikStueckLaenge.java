package Musiksammlung;

import java.util.Comparator;

public class VergleicheMusikStueckLaenge implements Comparator<MusikStueck> {

    @Override
    public int compare(MusikStueck m1, MusikStueck m2) {
        return Integer.compare(m1.laenge, m2.laenge);
    }

}
