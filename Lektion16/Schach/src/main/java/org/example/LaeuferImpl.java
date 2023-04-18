package org.example;

public class LaeuferImpl extends AbstractFigur implements Laeufer {
    public LaeuferImpl(int x, int y) {
        super(x, y);
    }

    public Brett gibErlaubteFelder() {
        Brett brett = new Brett();
        //TODO: Ergänzen Sie den Algorithmus zur Bestimmung der Felder
        for (int i = 1; i <= 8; i++) {
            int hitY = y - (x - i);
            if (hitY >= 1 && hitY <= 8) brett.markiereFeld(i, hitY);
            int hitX = y + (x - i);
            if (hitX >= 1 && hitX <= 8) brett.markiereFeld(i, hitX);
        }
        return brett;
    }

    public static void main(String[] args) {
        LaeuferImpl l = new LaeuferImpl(4, 5);
        Brett brett = l.gibErlaubteFelder();
        for (int j = 1; j <= 8; j++) {
            for (int i = 1; i <= 8; i++) {
                if (brett.gibFeld(i, j)) System.out.print("X ");
                else System.out.print("O ");
            }
            System.out.println();
        }
    }
}
