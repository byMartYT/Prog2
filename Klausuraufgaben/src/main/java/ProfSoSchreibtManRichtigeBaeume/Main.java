package ProfSoSchreibtManRichtigeBaeume;

public class Main {
    static Baum<Integer> baum;

    public static void main(String[] args) {
        baum = new Baum<>();

        baum.insert(5);
        baum.insert(3);
        baum.insert(2);
        baum.insert(8);
        baum.insert(7);
        baum.insert(9);
        baum.insert(1);
        baum.insert(10);

        baum.print();
        System.out.println("Size: " + baum.count());
    }
}
