package org.example;

public class Main {
    protected static Person[] personen = new Person[100];

    public static void start(){
        boolean prof = true;
        for (int i = 0; i < Main.personen.length; i++) {
            if (prof) {
                personen[i] = new Professor("Programmieren");
            } else {
                personen[i] = new Student("Programmieren");
            }
        }
    }
}
