package com.example.points;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceIsGood {
    public static void main(String[] args) {


        ScheduledExecutorService ses = Executors.newScheduledThreadPool(1);
        ses.schedule(new Runnable() {
            @Override
            public void run() {
                throw new RuntimeException("Some task failed");
            }
        }, 2000, TimeUnit.MILLISECONDS);

        ses.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("Tasks scheduled after failed ones still work fine");
            }
        }, 3000, TimeUnit.MILLISECONDS);
    }
}

