package fibonacci.model;

import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {
    private Fibonacci fibonacci;
    private long cursor = 0;
    private int a;
    private int b = 1;

    public FibonacciIterator(int size) {
        this.fibonacci = new Fibonacci(size);
    }

    @Override
    public boolean hasNext() {

        return cursor < fibonacci.getQuantity();
    }

    @Override
    public Integer next() {
        ++cursor;
        final int temp = a;
        a = b;
        b = b + temp;
        return a;
    }
}
