package com.example.chapter13String;

public class StringVSStringBuilderVSStringBuffer {
    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
        String a = "this is a " + "very " + "very "+ "very "+ "very "+ "very "+ "very "+ "very " + "long " + "string";
        System.out.println(System.currentTimeMillis() - t1);
        t1 = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer("this is a ")
                .append("very ")
                .append("very ")
                .append("very ")
                .append("very ")
                .append("very ")
                .append("very ")
                .append("very ")
                .append("long ")
                .append("string ");
        System.out.println(System.currentTimeMillis() - t1);
        t1 = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder("this is a ")
                .append("very ")
                .append("very ")
                .append("very ")
                .append("very ")
                .append("very ")
                .append("very ")
                .append("very ")
                .append("long ")
                .append("string ");
        System.out.println(System.currentTimeMillis() - t1);
        System.out.println("you guys are all too fast to show any difference");
    }
}
