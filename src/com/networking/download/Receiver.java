package com.networking.download;

import java.io.*;
import java.net.ServerSocket;

/**
 * Created by Alex@Modest on 16.05.17 14:31
 */

public class Receiver implements Runnable {
    @Override
    public void run() {

        File outputFile = new File("!output.txt");

        //File outputFile = new File("pathname");

        System.out.println("RECEIVER: Server started." +
                "\nRECEIVER: Waiting for data...");

        try (ServerSocket server = new ServerSocket(7474);
             DataInputStream inputStream = new DataInputStream(server.accept().getInputStream());
             DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(outputFile))) {

            int inputData;
            System.out.println("RECEIVER: Receiving data...");
            while ((inputData = inputStream.read()) != -1) {
                outputStream.write(inputData);
                outputStream.flush();
            }

            System.out.println("RECEIVER: Data received." +
                    "\nRECEIVER: Server stopped.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
