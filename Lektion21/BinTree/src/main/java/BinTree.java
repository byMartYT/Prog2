public class BinTree<E extends Comparable<E>> {

    Element<E> root = null;

    public void print() {
        try {
            root.print();
        } catch (NullPointerException e) {
            System.err.println("Der Baum hat keine Elemente");
        }
    }

    public void insert(E data) {
        try {
            root.insert(data);
        } catch (NullPointerException e) {
            root = new Element<>(data);
        }
    }


    private static class Element<E extends Comparable<E>> {
        Element<E> left, right;
        E data;

        public Element(E data) {
            this.data = data;
        }

        public void insert(E data) {
            if (this.data.compareTo(data) == 0) {
                System.err.println("Diese Datei existiert bereits");
                return;
            }
            if (this.data.compareTo(data) < 0) {
                if (right != null) {
                    right.insert(data);
                } else {
                    right = new Element<>(data);
                }
            } else {
                if(left != null) {
                    left.insert(data);
                } else {
                    left = new Element<>(data);
                }
            }
        }

        public void print() {
            try {
            left.print();
            } catch (NullPointerException e) {

            }
            System.out.println(data);
            try {
            right.print();
            } catch (NullPointerException e) {

            }
        }

    }
}
