package com.example.chapter15;

import com.example.chapter15.coffee.*;

import java.util.Iterator;
import java.util.Random;

public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {
    private Class[] types = {
            Latte.class, Mocha.class, Cappuccino.class, Americano.class, Breve.class
    };
    private Random random = new Random(47);
    private int size = 0;
    public CoffeeGenerator(int size) {
        this.size = size;
    }

    public CoffeeGenerator() {

    }
    @Override
    public Coffee next() {
        try {
            return (Coffee) types[random.nextInt(types.length)].newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    class CoffeeIterator implements Iterator<Coffee> {
        int count = size;

        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public Coffee next() {
            count --;
            return CoffeeGenerator.this.next();
        }
    }

    public static void main(String[] args) {
        CoffeeGenerator coffeeGenerator = new CoffeeGenerator();
        for (int i = 0; i < 5; i++) {
            System.out.println(coffeeGenerator.next());
        }
        for (Coffee c : new CoffeeGenerator(5)) {
            System.out.println(c);
        }
    }
}
