package org.example;

public class Professor extends Person{
    private String fach;

    public Professor(String fach) {
        this.fach = fach;
    }
    @Override
    public String gibTaetigkeitAus() {
        String res = String.format("Der Professor unterrichtet %s. %n", fach);
        System.out.printf(res);
        return res;
    }
}
