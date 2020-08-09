package com.example.chapter15;

import com.example.chapter15.coffee.Coffee;

import java.util.Map;

public class LimitOfInference {
    static void f(Map<String, ? extends Coffee> contacts) {

    }

    public static void main(String[] args) {
        f(New.map());
    }
}
