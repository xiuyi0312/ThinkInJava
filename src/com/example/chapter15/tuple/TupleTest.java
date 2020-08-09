package com.example.chapter15.tuple;

import com.example.chapter15.Amphibian;
import com.example.chapter15.Vehicle;

public class TupleTest {
    public static void main(String[] args) {
        TwoTuple<String, Integer> ttsi = f();
        System.out.println(ttsi);
        // has warning
        System.out.println((TwoTuple<String, Integer>) f2());
    }

    static TwoTuple<String, Integer> f() {
        return new TwoTuple<>("hi", 47);
    }

    static TwoTuple f2() {
        return new TwoTuple<>("hello", 33);
    }

    static ThreeTuple<Amphibian, String, Integer> g() {
        return new ThreeTuple<>(new Amphibian(), "hi", 47);
    }

    static FourTuple<Vehicle, Amphibian, String, Integer> h() {
        return new FourTuple<>(new Vehicle(), new Amphibian(), "hi", 47);
    }

    static FiveTuple<Vehicle, Amphibian, String, Integer, Double> k() {
        return new FiveTuple<>(new Vehicle(), new Amphibian(), "hi", 47, 11.1);
    }
}
