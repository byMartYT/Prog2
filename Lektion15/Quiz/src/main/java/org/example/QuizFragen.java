package org.example;

import java.util.Scanner;

public abstract class QuizFragen {
    Scanner sc = new Scanner(System.in);
    protected String frage;
    protected String antwort;

    public QuizFragen(String frage) {
        this.frage = frage;
    }

    @Override
    public abstract String toString();

    public abstract void antwort();
}
