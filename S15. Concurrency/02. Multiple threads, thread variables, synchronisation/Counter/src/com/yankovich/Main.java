package com.yankovich;

public class Main {

    public static void main(String[] args) {
        Countdown countdown = new Countdown();

        CountdownThread t1 = new CountdownThread(countdown);
        t1.setName("Thread 1");
        CountdownThread t2 = new CountdownThread(countdown);
        t2.setName("Thread 2");

        t1.start();
        t2.start();
    }
}
// heap is the applications(process) memory that all threads share
class Countdown {

    private int i;  // an object instance values allocated on the heap, multiple threads share the same object.

//    public synchronized void doCountdown() {
    public synchronized void doCountdown() {
        String color;

        switch (Thread.currentThread().getName()) {
            case "Thread 1":
                color = ThreadColor.ANSI_CYAN;
                break;
            case "Thread 2":
                color = ThreadColor.ANSI_PURPLE;
                break;
            default:
                color = ThreadColor.ANSI_GREEN;
        }


        synchronized (this){
            for (i = 10; i > 0;i--) { // local variables stored in the thread stack. Each thread has its own copy of that variable
                        System.out.println(color + Thread.currentThread().getName() + ": i = " + i);
                    }
        }
    }
}

class CountdownThread extends Thread {
    private Countdown threadCountdown;

    public CountdownThread(Countdown countdown) {
        threadCountdown = countdown;
    }

    public void run() {
        threadCountdown.doCountdown();
    }
}
