import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        try (FileReader fr = new FileReader("data.csv");
             BufferedReader bfr = new BufferedReader(fr))
        {
            boolean skipFirstLine = true;
            while(true) {
                String s = bfr.readLine();
                if(s != null) {
                    if(skipFirstLine) {skipFirstLine = false; continue;}
                    ls.add(s);
                } else break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        ls.stream().filter(s -> s.charAt(s.length()-1) == 'x').findAny().ifPresent(System.out::println);

        System.out.println(ls.stream().anyMatch(s -> s.charAt(s.length() -1) == 'x'));
    }
}
