import java.util.Comparator;
import java.util.List;

public class Main {

    static List<Mannschaft> tabelle = Mannschaft.createTabelle();

    public static void main(String[] args) {
        tabelle.stream().filter(m -> m.punkte > 50).forEach(System.out::println);

        System.out.println();

        tabelle.forEach(m -> System.out.println(m.name));

        System.out.println();

        tabelle.stream().filter(m -> m.name.charAt(0) == 'F').sorted(Comparator.comparing(m -> m.name)).forEach(System.out::println);

        System.out.println();

        System.out.println(tabelle.stream().max(Comparator.comparing(m -> m.gegentore)).get());

    }

}