package org.example;

public abstract class Wesen implements WesenInt{

    double unentschlossenheit;

    static Entscheidung getEntscheidung(Gefahr g) {
        switch (g.getWert()) {
            case "links":
                return Entscheidung.RECHTS;
            case "rechts":
                return Entscheidung.LINKS;
            case "vorne":
                return Entscheidung.BREMSEN;
            default:
                return Entscheidung.UNENTSCHIEDEN;
        }
    }
}
