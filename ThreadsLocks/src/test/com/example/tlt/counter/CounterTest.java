package com.example.tlt.counter;

import org.junit.Before;
import org.junit.Test;

import static CountingThread.NUM_OF_COUNTS;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

class CounterTest {

    private Counter counter;

    @Before
    public void setUp() {
        counter = new Counter();
    }

    @Test
    public void countingThread() throws InterruptedException {

        runThread();
        runThread();

        assertThat(counter.getCount(), is(NUM_OF_COUNTS));
    }

    void runThread() throws InterruptedException {
        CountingThread thread = new CountingThread(counter);
        thread.start();
        thread.join();
    }

}