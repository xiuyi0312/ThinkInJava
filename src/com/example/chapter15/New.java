package com.example.chapter15;

import java.util.*;

public class New {
    public static <K, V> HashMap<K, V> map() {
        return new HashMap<>();
    }

    public static <E> List<E> list() {
        return new ArrayList<>();
    }

    public static <E> Set<E> set() {
        return new HashSet<>();
    }
}
