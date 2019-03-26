package com.example.tlt.counter;

class CountingThread extends Thread {

    static final int NUM_OF_COUNTS = 1000;

    private Counter counter;

    public CountingThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int x = 0; x < NUM_OF_COUNTS; ++x) {
            counter.increment();
        }
    }
}
