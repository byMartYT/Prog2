package Fahrt;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;

public class Umsatzberechner {
    List<Fahrzeug> fahrzeugList = new ArrayList<>();

    public double berechneUmsatz(List<Fahrzeug> fahrzeuge) {
        double umsatz = 0.0;
        for(Fahrzeug f : fahrzeuge) {
            for (Fahrt fahrt : f.logs) {
                umsatz += f.calcPrice(fahrt);
            }
        }
        return umsatz;
    }

    public double berechneGesamtUmsatz() {
        return berechneUmsatz(fahrzeugList);
    }

    public double berechneElektroUmsatz() {
        List<Fahrzeug> l = fahrzeugList.stream().filter(f -> f instanceof ElektroFahrzeug).toList();
        return berechneUmsatz(l);
    }

    public static void main(String[] args) {
        Umsatzberechner ub = new Umsatzberechner();
        ub.fahrzeugList.add(new Fahrrad());
        ub.fahrzeugList.add(new Motorroller());
        ub.fahrzeugList.add(new Kleintransporter());
        ub.fahrzeugList.add(new EBike());

        ub.fahrzeugList.get(0).logRide(new Fahrt(50, 50));
        ub.fahrzeugList.get(0).logRide(new Fahrt(50, 50));
        ub.fahrzeugList.get(0).logRide(new Fahrt(50, 50));

        ub.fahrzeugList.get(1).logRide(new Fahrt(50, 50));
        ub.fahrzeugList.get(1).logRide(new Fahrt(50, 50));
        ub.fahrzeugList.get(1).logRide(new Fahrt(50, 50));

        ub.fahrzeugList.get(2).logRide(new Fahrt(50, 50));
        ub.fahrzeugList.get(2).logRide(new Fahrt(50, 70));
        ub.fahrzeugList.get(2).logRide(new Fahrt(50, 70));

        ub.fahrzeugList.get(3).logRide(new Fahrt(50, 70));
        ub.fahrzeugList.get(3).logRide(new Fahrt(50, 70));

        System.out.println(ub.berechneGesamtUmsatz());

        System.out.println(ub.berechneElektroUmsatz());

    }


}
