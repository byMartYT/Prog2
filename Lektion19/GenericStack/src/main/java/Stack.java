import java.util.ArrayList;

public class Stack<E> implements StackInterface<E> {

    ArrayList<E> list = new ArrayList<>();

    public boolean push(E o){
        return list.add(o);
    }

    public E pop() {
        return list.remove(list.size()-1);
    }

}