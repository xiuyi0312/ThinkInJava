package com.example.designpattern.proxy;

import java.lang.reflect.Proxy;

public class DynamicProxyTestDrive {
    public static void main(String[] args) {
        DynamicProxyTestDrive testDrive = new DynamicProxyTestDrive();


    }

    public PersonBean getOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person)
        );
    }

    public PersonBean getNonOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person)
        );
    }
}
