package BaumVisitor;

public class Counter<E extends Comparable<E>> implements Visitor<E>{

    private int size = 0;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void visit(Baum.Knoten<E> current) {
        size++;
    }


}
