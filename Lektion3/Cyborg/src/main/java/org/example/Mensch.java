package org.example;

public class Mensch extends Wesen implements WesenInt {
    @Override
    public Entscheidung entscheide(Gefahr g) {
        if(Math.random() < 0.25) return Entscheidung.UNENTSCHIEDEN;
        return getEntscheidung(g);
    }
}
