public class Visiteur<T> implements Visitor<T>{

    int count ;

    public Visiteur() {
        this.count = 0;
    }

    @Override
    public void visit(Baum.Knoten<T> current) {
        count++;
    }

    public int getCount() {
        return count;
    }
}
