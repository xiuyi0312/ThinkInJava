package com.example.chapter10innerclass;

public abstract class Event {
    private long eventTime;
    protected final long delayTime;
    public Event(long delayTime) {
        this.delayTime = delayTime;
        start();
    }

    public void start() {
        eventTime = System.nanoTime() + delayTime;
    }

    /**
     * could be exported so can be implemented in other ways
     *
     * @return true it's ready otherwise false
     */
    public boolean ready() {
        return System.nanoTime() >= eventTime;
    }

    public abstract void action();
}
