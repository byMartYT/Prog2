import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Vokabeltrainer {
    HashMap<String, ArrayList<String>> vokabeln = new HashMap<>();

    public void put(String s, ArrayList<String> a) {
        vokabeln.put(s, a);
    }

    public ArrayList<String> get(String s){
        return vokabeln.get(s);
    }
}
