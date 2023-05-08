import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(5);
        a1.add(9);
        a1.add(21);
        a1.add(27);
        Primzahlen p1 = new Primzahlen(a1);
        ArrayList<Integer> a2 = new ArrayList<>();
        a1.add(534234);
        a1.add(923652362);
        a1.add(223623661);
        a1.add(223623237);
        Primzahlen p2 = new Primzahlen(a2);
        ArrayList<Integer> a3 = new ArrayList<>();
        a1.add(5565);
        a1.add(29);
        a1.add(17);
        a1.add(13);
        a1.add(235354569);
        a1.add(457454521);
        a1.add(2745657);
        Primzahlen p3 = new Primzahlen(a3);

        p1.start();
        p2.start();
        p3.start();

        try {
            p1.join();
            p2.join();
            p3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        HashMap<Integer, Boolean> res = new HashMap<>();
        p1.result.forEach((key, value) -> res.merge(key, value, (v1,v2) -> true));
        p2.result.forEach((key, value) -> res.merge(key, value, (v1,v2) -> true));
        p3.result.forEach((key, value) -> res.merge(key, value, (v1,v2) -> true));

        System.out.println(print(res));
    }

    public static String print(HashMap<Integer, Boolean> a){
        StringBuilder sb = new StringBuilder();
        a.forEach((v1 ,v2) -> sb.append(v1 + " -> " + v2 + "\n"));
        return sb.toString();
    }
}
