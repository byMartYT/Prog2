package de.amp;

public class Main {

    public static double berechneKugelvolumen(double radius) {
        if(radius < 0) throw new RuntimeException("Fehler -> Negative Zahl");
        return 4d/3d*Math.PI*radius*radius*radius;
    }




}
