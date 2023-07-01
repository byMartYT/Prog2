package Morsen;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Morse {
    public final static String[][] tabelle = {
            {"A", ".−"},
            {"B", "−..."},
            {"C", "−.-."},
            {"D", "-.."},
            {"E", "."},
            {"F", "..-."},
            {"G", "--."},
            {"H", "...."},
            {"I", ".."},
            {"J", ".---"},
            {"K", "_._"},
            {"L", ".-.."},
            {"M", "--"},
            {"N", "-."},
            {"O", "---"},
            {"P", ".--."},
            {"Q", "--.-"},
            {"R", ".-."},
            {"S", "..."},
            {"T", "-"},
            {"U", "..-"},
            {"V", "...-"},
            {"W", ".--"},
            {"X", "-..-"},
            {"Y", "-.--"},
            {"Z", "--.."}
    };

    static Map<String, String> hashTable;

    static HashMap<String, String> getMorseCodeMap(String[][] tab) {
        HashMap<String, String> res = new HashMap<>();

        Arrays.stream(tab).forEach(el -> res.put(el[0],el[1]));

        return res;
    }

    static String zeichenketteToMorse(String s) {
        s = s.toUpperCase();
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()) {
            sb.append(hashTable.get(Character.toString(c))).append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        hashTable = getMorseCodeMap(tabelle);

        System.out.println(zeichenketteToMorse("Klausurerfolg"));
    }
}
