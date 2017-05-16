package com.networking.download;

import java.io.*;
import java.net.Socket;

/**
 * Created by Alex@Modest on 16.05.17 14:31
 */

public class Sender implements Runnable {
    @Override
    public void run() {

        File inputFile = new File("!input.txt");

        //File inputFile = new File("pathname");

        try (Socket client = new Socket("localhost", 7474);
             DataInputStream inputStream = new DataInputStream(new FileInputStream(inputFile));
             DataOutputStream outputStream = new DataOutputStream(client.getOutputStream())) {

            System.out.println("SENDER: Client started.");

            int inputData;
            System.out.println("SENDER: Sending data...");
            while ((inputData = inputStream.read()) != -1) {
                outputStream.write(inputData);
                outputStream.flush();
            }

            System.out.println("SENDER: Data sent." +
                    "\nSENDER: Client stopped.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
