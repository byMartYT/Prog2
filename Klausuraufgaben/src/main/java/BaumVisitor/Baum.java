package BaumVisitor;

public class Baum<E extends Comparable<E>> {
    public static class Knoten<E extends Comparable<E>> {
        Knoten<E> left;
        Knoten<E> right;
        E content;

        public Knoten(E content) {
            this.content = content;
        }

        public void einfuegen(E content) {
            switch (this.content.compareTo(content)) {
                case 1:
                    if (left == null) {
                        left = new Knoten<E>(content);
                    } else {
                        left.einfuegen(content);
                    }
                    break;
                case -1:
                    if (right == null) {
                        right = new Knoten<E>(content);
                    } else {
                        right.einfuegen(content);
                    }
                    break;
                case 0:
                    System.out.println("Bereits vorhanden");
            }

        }

        public void printinline() {
            if(left != null) {
                left.printinline();
            }
            System.out.println(content);
            if(right != null) {
                right.printinline();
            }
        }
    }

    Knoten<E> root;

    public void einfuegen(E content) {
        if (root != null) {
            root.einfuegen(content);
        } else {
            root = new Knoten<>(content);
        }
    }

    public int size() {
        Counter<E> v = new Counter<>();
        traversiere(v);
        return v.getSize();
    }

    public void printinline() {
        if(root != null) {
            root.printinline();
        }
    }

    protected void traversiere(Visitor<E> visitor) {
        if (root == null) return;
        else traversiere(root, visitor);
    }

    protected void traversiere(Knoten<E> current, Visitor<E> visitor) {
        if (current.left != null) traversiere(current.left, visitor);
        visitor.visit(current);
        if (current.right != null) traversiere(current.right, visitor);
    }
}
