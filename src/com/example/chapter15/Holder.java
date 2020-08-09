package com.example.chapter15;

public class Holder<T> {
    private T a1, a2, a3;

    public T getA1() {
        return a1;
    }

    public void setA1(T a1) {
        this.a1 = a1;
    }

    public T getA2() {
        return a2;
    }

    public void setA2(T a2) {
        this.a2 = a2;
    }

    public T getA3() {
        return a3;
    }

    public void setA3(T a3) {
        this.a3 = a3;
    }

    public Holder(T a1, T a2, T a3) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }
}
