package org.example;

import java.util.ArrayList;

public class Main {

    static ArrayList<QuizFragen> quiz = new ArrayList<>();
    public static void main(String[] args) {
        quiz.add(new Normal("Wie lautet der neue Uni Name (kurz)", "THWS"));
        quiz.add(new Normal("Wie lautet die Hauptstadt von DE", "Berlin"));
        quiz.add(new MC("Wie lautet der beste deutsche Fussballverein", 'B', new String[]{"Nürnberg", "FC Bayern", "Dortmund", "Liverpool"}));

        for(QuizFragen q : quiz) {
            System.out.println(q);
            q.antwort();
        }
    }
}