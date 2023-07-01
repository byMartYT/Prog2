package BaumVisitor;

public class Holz {

    static Baum<Integer> b = new Baum<>();
    public static void main(String[] args) {
        b.einfuegen(5);
        b.einfuegen(2);
        b.einfuegen(1);
        b.einfuegen(4);
        b.einfuegen(3);
        b.einfuegen(7);
        b.einfuegen(9);

        b.printinline();
        System.out.println("Size: " + b.size());
    }

}
