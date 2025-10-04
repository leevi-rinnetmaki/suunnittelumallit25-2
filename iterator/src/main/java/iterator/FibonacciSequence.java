package iterator;

import java.util.Iterator;

public class FibonacciSequence implements Sequence{
    @Override
    public Iterator<Integer> iterator() {
        return new FibonacciIterator(this);
    }

    int generateNumbers(int[] numbers){
        return numbers[0]+numbers[1];
    }
}