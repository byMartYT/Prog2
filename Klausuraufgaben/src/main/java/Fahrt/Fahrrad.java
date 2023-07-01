package Fahrt;

public class Fahrrad extends Fahrzeug{

    @Override
    public double calcPrice(Fahrt f) {
        return 0.125 * f.min;
    }
}
