package com.example.chapter15;

public class Holder2 {
    private Object a;

    public Holder2(Object a) {
        this.a = a;
    }

    public void set(Object a) {
        this.a = a;
    }

    public Object get() {
        return a;
    }

    public static void main(String[] args) {
        Holder2 holder2 = new Holder2(new Automobile());
        Automobile automobile = (Automobile) holder2.get();
        holder2.set("I am not an automobile");
        String str = (String) holder2.get();
        holder2.set(1);
        int value = (int) holder2.get();
        System.out.println(automobile);
        System.out.println(str);
        System.out.println(value);
    }
}
