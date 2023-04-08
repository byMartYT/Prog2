package org.example;

public enum Gefahr {
    GEFAHR_LINKS("links"), GEFAHR_RECHTS("rechts"), GEFAHR_VORNE("vorne");

    final String wert;

    Gefahr(String wert) {
        this.wert = wert;
    }

    public String getWert() {
        return wert;
    }
}
