package org.example;

public class Roboter extends Wesen implements WesenInt {

    @Override
    public Entscheidung entscheide(Gefahr g) {
        return getEntscheidung(g);
    }
}
