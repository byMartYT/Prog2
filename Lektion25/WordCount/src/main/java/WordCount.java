import org.jsoup.Jsoup;

import java.io.IOException;
import java.util.List;

import static java.util.stream.Collectors.groupingBy;


public class WordCount {
   //Implementieren Sie das Word Count Beispiel mit Map Reduce. Verwenden Sie das Framework JSoup zum Herunterladen der Webseiten und die Java Stream-API zur Implementierung des Map Reduce Algorithmus.
    //Hinweis: Ggf. hilft Ihnen die Verwendung der flatMap-Methode weiter.
    public static void main(String[] args) {
        List<String> urls = List.of("https://www.tagesschau.de/", "https://www.spiegel.de/", "https://www.sueddeutsche.de/");
        urls.stream()
                .map(WordCount::download)
                .flatMap(WordCount::split)
                .collect(groupingBy(String::toLowerCase))
                .entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().size() - e1.getValue().size())
                .limit(10)
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue().size()));
    }

    private static String download(String url) {
        try {
            return Jsoup.connect(url).get().text();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static List<String> split(String text) {
        return List.of(text.split("\\s+"));
    }


}
