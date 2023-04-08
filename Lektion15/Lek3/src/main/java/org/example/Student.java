package org.example;

public class Student extends Person{
    private String fach;

    public Student(String fach) {
        this.fach = fach;
    }

    @Override
    public String gibTaetigkeitAus() {
        String res = String.format("Der Student besucht das Fach %s. %n", fach);
        System.out.printf(res);
        return res;
    }
}
