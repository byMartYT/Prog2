package ProfSoSchreibtManRichtigeBaeume;

public class Baum<E extends Comparable<E>> {

    public static abstract class NodeAbst<E extends Comparable<E>> {
        abstract NodeAbst<E> insert(E content);

        abstract int count();

        abstract void print();

        public static class Node<E extends Comparable<E>> extends NodeAbst<E> {
            NodeAbst<E> left;
            NodeAbst<E> right;
            E content;

            public Node(E content) {
                this.content = content;
                this.left = new Closer();
                this.right = new Closer();
            }

            @Override
            NodeAbst<E> insert(E content) {
                switch (this.content.compareTo(content)) {
                    case 1 -> left = left.insert(content);
                    case -1 -> right = right.insert(content);
                }
                return this;
            }

            @Override
            int count() {
                return 1 + left.count() + right.count();
            }

            @Override
            void print() {
                left.print();
                System.out.println(content);
                right.print();
            }
        }

        public static class Closer<E extends Comparable<E>> extends NodeAbst<E> {

            @Override
            NodeAbst<E> insert(E content) {
                return new Node<E>(content);
            }

            @Override
            int count() {
                return 0;
            }

            @Override
            void print() {}
        }
    }

    private NodeAbst<E> root = new NodeAbst.Closer<>();


    void insert(E content) {
        root = root.insert(content);
    }

    int count() {
        return root.count();
    }

    void print() {
        root.print();
    }





}
