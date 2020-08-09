package com.example.chapter15;

import java.util.ArrayList;
import java.util.Random;

public class RandomList<T> {
    private ArrayList<T> storage = new ArrayList<>();
    private Random rand = new Random(47);

    public void add(T item) {
        storage.add(item);
    }

    public T select() {
        return storage.get(rand.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        RandomList<String> rs = new RandomList<>();
        for (String elem :
                "this is for testing random list 2020.03.27".split(" ")) {
            rs.add(elem);
        }
        System.out.println(rs.select());
    }
}
