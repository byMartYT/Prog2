package de.amp;

public class Strecke {

    private int a, b;

    public Strecke(int a, int b) {
        this.a = a > b ? b : a;
        this.b = a > b ? a : b;
    }

    public boolean checkUeberschneidung(Strecke s) {
        if (s.getB() - s.getA() == 0 || b - a == 0) return false;
        if (this.a >= s.getA() && this.a < s.getB()) return true;
        if (this.b <= s.getB() && this.b > s.getA()) return true;
        if (this.a < s.getA() && this.b > s.getB()) return true;
        return false;
    }

    @Override
    public String toString() {
        if (a == b) return Integer.toString(this.a);

        String res = Integer.toString(this.a);

        for (int i = a; i < b; i++) {
            res += "-";
        }

        res += Integer.toString(this.b);

        return res;
    }

    protected int getA() {
        return a;
    }

    protected int getB() {
        return b;
    }

}
