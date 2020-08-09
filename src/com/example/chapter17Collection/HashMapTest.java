package com.example.chapter17Collection;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("hello", 5);
        map.put("you", 3);
        System.out.println(map.get("hello"));
    }
}
