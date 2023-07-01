package Dateisuche;

import java.io.*;

public class Finder {
    public BufferedReader getSystemInAsBufferedReader()  {
        InputStreamReader isr = new InputStreamReader(System.in);
        return new BufferedReader(isr);
    }
    public void findStringInFiles(String searchString, String[] filenames)   {
        for(String f : filenames) {
            try(FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr)
            ) {
                String line = null;
                int lineCount = 0;
                while((line = br.readLine()) != null) {
                    lineCount++;
                    if(line.contains(searchString)) {
                        System.out.printf("Found: in %s, line %d%n", f, lineCount);
                    }
                }

            } catch (IOException e) {
                System.err.println(f + " konnte nicht geöffnet werden");
                continue;
            }
        }
    }
    public static void main(String[] args)
    {
        Finder finder = new Finder();
        BufferedReader br = finder.getSystemInAsBufferedReader();
        String searchString = null;
        try {
            searchString = br.readLine();
            finder.findStringInFiles(searchString, args);
            br.close();
        } catch (IOException ex) {
            System.out.println("Einlesen fehlgeschlagen.");
        }; }
}
