package Fahrt;

public class Motorroller extends Fahrzeug {
    @Override
    public double calcPrice(Fahrt f) {
        return 3.0 + 0.15 * f.km;
    }
}
