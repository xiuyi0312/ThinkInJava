package com.example.chapter18io;

public class DirectoryDemo {
    public static void main(String[] args) {
        PrettyPrint.prettyPrint(Directory.walk(".", ".*\\.java").dirs);
        System.out.println("=====================");
        PrettyPrint.prettyPrint(Directory.walk(".", "D.*").files);
    }
}
