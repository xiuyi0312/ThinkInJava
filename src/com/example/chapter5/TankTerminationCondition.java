package com.example.chapter5;

public class TankTerminationCondition {
}

class Tank {
    private boolean empty = true;
    public Tank() {

    }
    public void put() {
        empty = false;
    }
    public void remove() {
        empty = true;
    }

    @Override
    protected void finalize() {
        if(!empty) {
            System.out.println("Error: tank is not empty");
        }
    }
}
