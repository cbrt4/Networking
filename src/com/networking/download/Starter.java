package com.networking.download;

/**
 * Created by Alex@Modest on 16.05.17 14:46
 */

public class Starter {
    public static void main(String[] args) throws InterruptedException {

        new Thread(new Receiver()).start();

        Thread.sleep(100);

        new Thread(new Sender()).start();
    }
}
