package com.example.points;

import java.util.Timer;
import java.util.TimerTask;

public class TimerIsNotGood {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                throw new RuntimeException("Some Task failed");
            }
        }, 2000);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Tasks after the failed one cannot be executed any more");
            }
        }, 3000);
    }
}