package IBAN;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IBAN {

    public static void main(String[] args) {
        try {
            ibanAusDateiLesen("ibans.txt");
        } catch (FalscheIBANException e) {
            System.err.println("Eine oder mehrere Ibans sind nicht korrekt: " + e.getMessage());
        }
    }

    public static void dateienTest(String[] file) {
        for(String s : file) {
            try {
                ibanAusDateiLesen(s);
            } catch (FalscheIBANException e) {
                System.out.println("Fehlerhafte Ibans in: " + s);
            }
        }
    }

    public static boolean ibanCheck(String iban) throws FalscheIBANException {
        if(iban.length() > 22) {
            System.out.println(iban.length());
            throw new FalscheIBANException(iban + " ist zu lang");
        } else if(iban.length() < 22) throw new FalscheIBANException(iban + " ist zu kurz");
        else if(iban.charAt(0) != 'D' && iban.charAt(1) != 'E') throw new FalscheIBANException(iban + "Dies ist keine Deutsche IBAN. Die ersten beiden Stellen müssen \"DE\" sein");
        return true;
    }

    public static void ibanAusDateiLesen(String file) throws FalscheIBANException {

        List<String> ibans = new ArrayList<>();

        try(
                Reader r = new FileReader(file);
                BufferedReader br = new BufferedReader(r);
        ) {

            String line;
            while((line = br.readLine()) != null) {
                ibans.add(line);
            }

            for (String iban : ibans) {
                ibanCheck(iban);
            }
            System.out.println("Die Ibans sind korrekt");

        } catch (FileNotFoundException e) {
            System.err.println("Datei " + file + " nicht gefunden");
        } catch (NullPointerException e) {
            System.err.println("Datei " + file + " existiert nicht");
        } catch (IOException e) {
            System.err.println("Fehler beim Lesevorgang von Datei: " + file);
        }

    }



    public static class FalscheIBANException extends Exception {

        public FalscheIBANException() {
            super("FEHLER: Datei enthält ungültige IBAN");
        }
        public FalscheIBANException(String message) {
            super(message);
        }
    }
}



