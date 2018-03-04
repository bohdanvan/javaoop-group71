package com.bvan.javaoop.lessons11_12.multithreading;


/**
 * @author bvanchuhov
 */
public class DaemonExample {

    public static void main(String[] args) {
        Thread musicThread = new Thread(new MusicTask());
        musicThread.setDaemon(true);
        musicThread.start();

        someJob();
    }

    private static void someJob() {
        ThreadUtils.println("Some job started");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ThreadUtils.println("Some job finished");
    }
}

class MusicTask implements Runnable {

    @Override
    public void run() {
        while (true) {
            ThreadUtils.println("Music...");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
