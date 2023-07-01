package Fahrt;

public abstract class ElektroFahrzeug extends Fahrzeug{
    public abstract double calcPrice(Fahrt f);

    public void kehreZurueckZurLadeStation() {
        return;
    }
}
