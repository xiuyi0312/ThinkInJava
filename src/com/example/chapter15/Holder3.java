package com.example.chapter15;

/**
 * T为类型参数，创建时必须指明想持有什么类型的对象
 * @param <T>
 */
public class Holder3<T> {
    private T a;

    public Holder3(T a) {
        this.a = a;
    }

    public void setA(T a) {
        this.a = a;
    }

    public T getA() {
        return a;
    }

    public static void main(String[] args) {
        Holder3<Automobile> holder3 = new Holder3<>(new Automobile());
        Automobile a = holder3.getA();
        System.out.println(a);

        Holder3<Automobile> holder31 = new Holder3<>(new Car());

    }
}
