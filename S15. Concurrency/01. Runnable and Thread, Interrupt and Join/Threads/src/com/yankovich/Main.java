package com.yankovich;

import static com.yankovich.ThreadColor.ANSI_GREEN;
import static com.yankovich.ThreadColor.ANSI_PURPLE;
import static com.yankovich.ThreadColor.ANSI_RED;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE +"Hello from the main thread");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("== Another Thread ==");
        anotherThread.start(); // don't call run() method directly because it will run on the main thread instead another thread

        // anonymous class / sub-classing
        new Thread(() -> System.out.println(ANSI_GREEN + "Hello from the anonymous class thread")).start();

        // so I have now created a new thread based on the my runnable class that I just created
/*        Thread myRunnableThread = new Thread(new MyRunnable());
        myRunnableThread.start();*/
        Thread myRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
//                super.run();
                System.out.println(ANSI_RED + "Hello from the anonymous class's implementation of run()");
                try {
                    anotherThread.join(2000);
                    System.out.println(ANSI_RED + "AnotherThread terminated or timed out, so I'm running again");
                } catch (InterruptedException e) {
                    System.out.println(ANSI_RED + "Thread was interrupted");
                }
            }
        });
        myRunnableThread.start();
//        anotherThread.interrupt();

        System.out.println(ANSI_PURPLE + "Hello again form the main thread");

    }
}
