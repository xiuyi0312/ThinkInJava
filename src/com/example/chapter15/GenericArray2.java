package com.example.chapter15;

public class GenericArray2<T> {
    private Object[] array;
    public GenericArray2(int size) {
        array = new Object[size];
    }

    public T get(int index) {
        return (T) array[index];
    }
    public void put(int index, T item) {
        array[index] = item;
    }
    public T[] rep() {
        return (T[]) array;
    }

    public static void main(String[] args) {
        GenericArray2<Integer> gai = new GenericArray2<>(10);
        for (int i = 0; i < 10; i++) {
            gai.put(i, i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(gai.get(i));
        }
        try {
            Integer[] rep = gai.rep();
        } catch (Exception e) {
            //java.lang.ClassCastException: class [Ljava.lang.Object; cannot be cast to class [Ljava.lang.Integer;
        }
    }

}
