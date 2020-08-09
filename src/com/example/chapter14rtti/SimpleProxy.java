package com.example.chapter14rtti;

public class SimpleProxy implements Interface {
    private Interface proxied;

    public SimpleProxy(Interface proxied) {
        this.proxied = proxied;
    }
    @Override
    public void doSomething() {
        // we can add some extra operations here, avoiding modifying the real object
        this.proxied.doSomething();
    }

    @Override
    public void somethingElse(String a) {
        // we can add some extra operations here, avoiding modifying the real object
        this.proxied.somethingElse(a);
    }
}
