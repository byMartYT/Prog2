import java.util.ArrayList;

//Klasse zum Upload ins e-learning
public class StackVererbung<E> extends ArrayList<E> implements StackInterface<E> {
    public boolean push(E element) {
        return super.add(element);
    }

    public E pop() {
        return super.remove(super.size() - 1);
    }

}
