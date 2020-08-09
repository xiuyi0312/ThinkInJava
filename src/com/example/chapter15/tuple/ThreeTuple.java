package com.example.chapter15.tuple;

public class ThreeTuple<A, B, C> extends TwoTuple<A, B> {
    public C third;

    public ThreeTuple(A first, B second, C third) {
        super(first, second);
        this.third = third;
    }

    @Override
    public String toString() {
        return "ThreeTuple{" +
                "third=" + third +
                ", first=" + first +
                ", second=" + second +
                '}';
    }
}
