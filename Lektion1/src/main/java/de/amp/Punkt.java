package de.amp;

public class Punkt {
    int x;
    int y;

    public void verschiebePunkt(int zielX, int zielY) {
        if(zielX < 0 || zielY < 0) throw new RuntimeException("x oder y kleiner 0");
        if(zielX > 1920 || zielY > 1080) throw new RuntimeException("x oder y zu groß");
        x = zielX;
        y = zielY;
    }
}
