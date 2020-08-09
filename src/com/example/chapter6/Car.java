package com.example.chapter6;

import java.util.Arrays;

public class Car extends Vehicle {
    public void stop() {
        System.out.println("stop in Car");
    }

    static void test(Vehicle vehicle) {
        vehicle.run();
    }
}
