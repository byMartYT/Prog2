package Iterator;

import java.util.Iterator;

public class RouletteZahlenIterator implements Iterator<Integer> {

    private int countZero;
    private static int randomNumber() {
        return (int) (Math.random() * 36);
    }

    @Override
    public boolean hasNext(){
        return countZero < 3;
    }

    @Override
    public Integer next(){
        int num = randomNumber();
        if(num == 0) {
            countZero++;
        } else {
            countZero = 0;
        }
        return num;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("remove() is not supported");
    }
}
