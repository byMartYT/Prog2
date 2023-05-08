import java.io.*;
import java.util.HashMap;

public class SMS {

    static HashMap<Character, String> conversionTable = new HashMap<>();

    public static void initMap() {
        int letter = 0;
        for (int i = 2; i <= 9; i++) {
            // i + 65
            int letters_amount = 3;
            if (i == 7 || i == 9) letters_amount = 4;
            String res = "";
            for (int j = 0; j < letters_amount; j++) {
                res += i;

            }
            conversionTable.put((char) (letter + 65), res);
            letter++;
        }
    }

    public static void main(String[] args) {
        try (
                Reader r = new FileReader("Zeichenkontakte.txt");
                BufferedReader br = new BufferedReader(r);
                Writer w = new FileWriter("Nummernkontakte.txt");
                BufferedWriter bw = new BufferedWriter(w);
        ) {
            initMap();
            String res = "";
            String line;

            while ((line = br.readLine()) != null) {
                res += line;
            }
            bw.write(convert(res));
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String convert(String text){
        StringBuilder sb = new StringBuilder();
        for(char c : text.toCharArray()) {
            sb.append(conversionTable.get(c));
        }
        return sb.toString();
    }


}
