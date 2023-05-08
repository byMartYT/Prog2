import java.util.HashMap;
import java.util.List;

public class Primzahlen extends Thread {
    List<Integer> toCheck;

    HashMap<Integer, Boolean> result = new HashMap<>();

    public Primzahlen(List<Integer> toCheck){
        this.toCheck = toCheck;
    }

    public boolean testNumber(int nr) {
        if(nr < 2) return false;
        for(int i = 2; i < nr; i++) {
            if(nr % i == 0) return false;
        }
        return true;
    }

    @Override
    public void run() {
        for(int i : toCheck) {
            result.put(i, testNumber(i));
        }
    }
}
