package com.example.chapter15.fib;

import java.util.Iterator;

public class IterableFibonacci extends Fibonacci implements Iterable<Integer> {
    private int n;
    public IterableFibonacci(int count) {
        this.n = count;
    }
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return n > 0;
            }

            @Override
            public Integer next() {
                n --;
                return IterableFibonacci.this.next();
            }
        };
    }
}
