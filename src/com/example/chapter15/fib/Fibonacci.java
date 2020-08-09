package com.example.chapter15.fib;

import com.example.chapter15.Generator;

public class Fibonacci implements Generator<Integer> {
    private int count = 0;

    @Override
    public Integer next() {
        return fib(count++);
    }

    private int fib(int count) {
        if (count < 2) {
            return 1;
        } else {
            return fib(count - 1) + fib(count - 2);
        }
    }
}
