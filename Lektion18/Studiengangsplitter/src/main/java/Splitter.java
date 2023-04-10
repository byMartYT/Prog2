import java.io.*;

public class Splitter {

    public static void main(String[] args) throws MatrikelnummerException, IOException {
        splitStudiengaenge("MatrNr.txt");
    }


    public static void splitStudiengaenge(String dateiname) throws MatrikelnummerException, IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(dateiname));
             BufferedWriter winf = new BufferedWriter(new FileWriter("WInfNr.txt"));
             BufferedWriter inf = new BufferedWriter(new FileWriter("InfNr.txt"));
             BufferedWriter ec = new BufferedWriter(new FileWriter("ECNr.txt"));
        ) {
            String s;
            while (true) {
                s = reader.readLine();
                if(s == null) break;
                int res = Integer.parseInt(s);
                if(res >= 5000000 && res <= 5099999) {
                    winf.write(s + "\n");
                } else if (res >= 5100000 && res <= 5199999) {
                    inf.write(s + "\n");
                } else if (res >= 6100000 && res <= 6199999) {
                    ec.write(s + "\n");
                } else {
                    throw new MatrikelnummerException();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new IOException();
        }
    }

}
