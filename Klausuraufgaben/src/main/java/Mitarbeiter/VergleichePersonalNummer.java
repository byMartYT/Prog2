package Mitarbeiter;

import java.util.Comparator;

public class VergleichePersonalNummer implements Comparator<Mitarbeiter> {

    @Override
    public int compare(Mitarbeiter o1, Mitarbeiter o2) {
        if(o1.equals(o2)) return 0;
        return o1.getNummer() < o2.getNummer() ? -1 : 1;
    }
}
