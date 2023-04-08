package org.example;

import java.io.IOException;

public class MC extends QuizFragen{

    private String[] antwortmoeglichkeiten;
    private char antwort;
    public MC(String frage, char antwort, String[] antwortmoeglichkeiten) {
        super(frage);
        this.antwort = antwort;
        this.antwortmoeglichkeiten = antwortmoeglichkeiten;
    }


    @Override
    public String toString() {
        String res = frage + "\n \nAntwortmöglichkeiten:\n";
        char mo = 'A';
        for (int i = 0; i < antwortmoeglichkeiten.length; i++) {
            res += mo + ": " + antwortmoeglichkeiten[i] + "\n";
            mo++;
        }
        return res;
    }

    @Override
    public void antwort() {
        try {
            char antwort = (char)System.in.read();
            if (antwort == this.antwort) {
                System.out.println("Richtige Antwort");
            } else {
                System.out.printf("Die Antwort ist falsch, die richtige Antwort lautet: %c%n", this.antwort);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
