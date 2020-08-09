package com.example.points;

public class TryCatchFinally {
    public static void main(String[] args) {
        System.out.println(test());
    }

    public static int test() {
        try {
            int a = 0;
            int b = 10 / 1;
            System.out.println("ok");
        } catch (Exception e) {
            System.out.println("catch");
            return -1;
        } finally {
            System.out.println("finally");
//            return 1;
        }
//        System.out.println("finally");
//        return 0;
        return 0;
    }
}
