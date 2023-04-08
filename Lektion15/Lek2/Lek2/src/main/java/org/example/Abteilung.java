package org.example;

import java.util.ArrayList;

public class Abteilung {

    ArrayList<Angestellter> mitarbeiter = new ArrayList<>();

    public int findMA(String nachname) {
        for (int i = 0; i < mitarbeiter.size(); i++) {
            if (mitarbeiter.get(i).isEqual(nachname)) {
                return i;
            }
        }
        return -1;
    }

}
