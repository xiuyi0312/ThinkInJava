package com.example.chapter14rtti;

import java.lang.reflect.Proxy;

public class DynamicProxyDemo {

    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        RealObject realObject = new RealObject();
        consumer(realObject);

        Interface proxy = (Interface) Proxy.newProxyInstance(Interface.class.getClassLoader(),
                new Class[]{Interface.class},
                new DynamicProxyHandler(realObject));

        consumer(proxy);
    }
}
