package com.example.chapter15;

import com.example.chapter15.coffee.Coffee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericMethods {
    /**
     * obviously if <T> is not added, then T would be treated as a type of Class
     * @param x
     * @param <T>
     */
    public <T> void f(T x) {
        System.out.println(x.getClass().getSimpleName());
    }

    public <T, U, V> void f(T x, U y, V v) {
        System.out.println(x.getClass().getSimpleName() + ", " +
                y.getClass().getSimpleName()+", " + v.getClass().getSimpleName());
    }

    public <T, V> void f(T x, String y, V v) {
        System.out.println(x.getClass().getSimpleName() + ": " +
                y.getClass().getSimpleName()+": " + v.getClass().getSimpleName());
    }

    static void g(Map<String, List<? extends Coffee>> list) {
        System.out.println(list.getClass().getSimpleName());
    }

    public static <K, V> Map<K, V> map() {
        return new HashMap<>();
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f("");
        gm.f(1);//这里会自动打包
        gm.f(1.0);//这里会自动打包
        gm.f(gm);

        gm.f(GenericMethods.map());

        GenericMethods.g(GenericMethods.map());

        gm.f("hello", "1", "world");
        gm.f("hello", 1, "world");

    }
}
