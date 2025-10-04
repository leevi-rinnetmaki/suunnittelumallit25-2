package iterator;
import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {
    @Override
    public Integer next() {
        int newNumber = fibonacciSequence.generateNumbers(sequence);
        sequence[0]=sequence[1];
        sequence[1]=newNumber;
        return sequence[1];
    }
    @Override
    public boolean hasNext() {
        return true;
    }

    FibonacciSequence fibonacciSequence;

    public int[] sequence = new int[2];
    /*
    sequence[0] = 1;
    sequence[1] = 1;
     */
    public void I_tried_to_do_this_originally_without_this_function_but_it_didnt_work_so_now_it_is_done_with_this_function(){
        sequence[0] = 1;
        sequence[1] = 1;
    }

    public FibonacciIterator(FibonacciSequence fibonacciSequence){
        I_tried_to_do_this_originally_without_this_function_but_it_didnt_work_so_now_it_is_done_with_this_function();
        this.fibonacciSequence = fibonacciSequence;
    }

    /*
    I decided to store the sequence in the iterator as it means that a single instance of FibonacciSequence
    can make multiple independent iterators.
     */
}