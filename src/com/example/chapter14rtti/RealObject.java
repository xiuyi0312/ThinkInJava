package com.example.chapter14rtti;

public class RealObject implements Interface {
    @Override
    public void doSomething() {
        System.out.println("doSomething()");
    }

    @Override
    public void somethingElse(String a) {
        System.out.println("somethingElse " +a);
    }
}
