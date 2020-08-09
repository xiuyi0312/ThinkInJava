package com.example.chapter15.tuple;

public class Tuple {
    public static <A, B> TwoTuple<A, B> create(A first, B second) {
        return new TwoTuple<>(first, second);
    }

    public static <A, B, C> ThreeTuple<A, B, C> create(A first, B second, C third) {
        return new ThreeTuple<>(first, second, third);
    }

    public static <A, B, C, D> FourTuple<A, B, C, D> create(A first, B second, C third, D fourth) {
        return new FourTuple<>(first, second, third, fourth);
    }

    public static <A, B, C, D, E> FiveTuple<A, B, C, D, E> create(A a, B b, C c, D d, E e) {
        return new FiveTuple<>(a, b, c, d, e);
    }
}
