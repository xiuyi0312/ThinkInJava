package com.example.chapter15;

import com.example.chapter15.coffee.Coffee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Generators {
    public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++) {
            coll.add(gen.next());
        }
        return coll;
    }

    public static <T> List<T> fill(List<T> list, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++) {
            list.add(gen.next());
        }
        return list;
    }

    public static <T> LinkedList<T> fill(LinkedList<T> list, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++) {
            list.add(gen.next());
        }
        return list;
    }

    public static void main(String[] args) {
        List<Coffee> coffees = fill(new ArrayList<>(), new CoffeeGenerator(), 10);
        LinkedList<Coffee> coffees2 = fill(new LinkedList<>(), new CoffeeGenerator(), 10);
        System.out.println(coffees);
    }
}
