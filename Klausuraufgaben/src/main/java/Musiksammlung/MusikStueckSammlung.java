package Musiksammlung;

import java.util.Arrays;
import java.util.HashMap;

public class MusikStueckSammlung {
    static HashMap<String, MusikStueck> musik = new HashMap<>();

    public static void musikStueckEinfuegen(MusikStueck m) {

        musik.keySet().forEach(el -> {if(el.equals(m.titel)) throw new IllegalArgumentException("Dieser Titel exisitiert bereits in deiner Sammlung");});
        musik.put(m.titel, m);
    }

    public static void main(String[] args) {
        musikStueckEinfuegen(new MusikStueck("test", "ich", 20));
        musikStueckEinfuegen(new MusikStueck("adf", "thomas", 50));
        musikStueckEinfuegen(new MusikStueck("zdf", "sdfsdf", 50));

        musik.values().forEach(System.out::println);

        Arrays.stream(getAlleMusikStueckeNachLaenge()).forEach(System.out::println);

    }

    public static MusikStueck[] getAlleMusikStueckeNachTitel() {
        MusikStueck[] res =  musik.values().toArray(new MusikStueck[0]);
        Arrays.sort(res, new VergleicheMusikStueckTitel());
        return res;
    }

    public static MusikStueck[] getAlleMusikStueckeNachLaenge() {
        MusikStueck[] res =  musik.values().toArray(new MusikStueck[0]);
        Arrays.sort(res, new VergleicheMusikStueckLaenge());
        return res;
    }
}
