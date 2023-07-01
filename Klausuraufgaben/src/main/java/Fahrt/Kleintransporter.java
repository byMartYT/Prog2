package Fahrt;

public class Kleintransporter extends Fahrzeug{
    @Override
    public double calcPrice(Fahrt f) {
        return f.min > 60 ? 0.3 * f.km + 0.25 * f.min : 0.3 * f.km;
    }
}
