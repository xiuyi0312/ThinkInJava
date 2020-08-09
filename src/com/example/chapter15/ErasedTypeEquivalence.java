package com.example.chapter15;

import java.util.ArrayList;

public class ErasedTypeEquivalence {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Integer> integers = new ArrayList<>();

        Class a = strings.getClass();
        Class b = integers.getClass();
        System.out.println(a == b);
    }
}
