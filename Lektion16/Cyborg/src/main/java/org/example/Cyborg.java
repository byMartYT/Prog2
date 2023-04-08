package org.example;

public class Cyborg extends Wesen implements WesenInt{

    Wesen m = new Mensch();
    Wesen r = new Roboter();
    @Override
    public Entscheidung entscheide(Gefahr g) {
        Entscheidung me = m.entscheide(g);
        Entscheidung mr = r.entscheide(g);

        if(me.equals(mr)) return me;
        if(Math.random() < 0.5) return me; else return mr;
    }
}