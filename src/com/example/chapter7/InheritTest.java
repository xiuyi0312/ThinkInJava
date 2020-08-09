package com.example.chapter7;

public class InheritTest {
    public static void main(String[] args) {

    }

    class A  {
        public A(int i) {

        }

//        public A() {
//
//        }
    }

    class B extends A {
        public B(int i) {
            super(i);
        }
        public B() {
            super(2);
        }
    }
}
