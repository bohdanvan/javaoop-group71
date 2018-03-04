package com.bvan.javaoop.lessons11_12.multithreading;

/**
 * @author bvanchuhov
 */
public class BarWithMultithreading {

    public static void main(String[] args) {
        ThreadUtils.println("Bar is opened");

        for (int drinkerId = 1; drinkerId <= 3; drinkerId++) {
            Runnable drinker = new Drinker(drinkerId);
            Thread drinkerThread = new Thread(drinker);
            drinkerThread.start();
        }

        ThreadUtils.println("Bar is closed");
    }
}
