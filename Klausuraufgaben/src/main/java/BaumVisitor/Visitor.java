package BaumVisitor;

public interface Visitor<T extends Comparable<T>> {

    public void visit(Baum.Knoten<T> current);
}
