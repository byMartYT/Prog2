package Musiksammlung;

import java.util.Comparator;

public class VergleicheMusikStueckTitel implements Comparator<MusikStueck> {

    @Override
    public int compare(MusikStueck m1, MusikStueck m2) {
        return m1.titel.compareTo(m2.titel);
    }
}
