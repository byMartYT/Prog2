package org.example;

public class Normal extends QuizFragen{
    private String antwort;

    public Normal(String frage, String antwort) {
        super(frage);
        this.antwort = antwort;
    }

    @Override
    public String toString() {
        return String.format("%s %n %nAntwort:%n", frage);
    }

    @Override
    public void antwort() {
        if (sc.next().equalsIgnoreCase(antwort)) {
            System.out.println("Richtige Antwort!");
        } else {
            System.out.printf("Die Antwort ist falsch, die richtige Antwort lautet: %s %n", this.antwort);
        }
    }
}
