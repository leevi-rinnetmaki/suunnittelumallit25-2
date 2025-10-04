package iterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        FibonacciSequence fibonacciSequence = new FibonacciSequence();
        Iterator<Integer> fibonacciIterator = fibonacciSequence.iterator();
        for(int i=0; i<100; i++){
            System.out.println(fibonacciIterator.next());
        }
        //Due to integer overflow, we get negative numbers eventually. How sad.

    }
}
