package Fahrt;

import java.util.ArrayList;
import java.util.List;

public abstract class Fahrzeug {

    List<Fahrt> logs = new ArrayList<>();

    public void logRide(Fahrt f) {
        logs.add(f);
    }

    public abstract double calcPrice(Fahrt f);


}
