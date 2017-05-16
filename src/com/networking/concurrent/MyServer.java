package com.networking.concurrent;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyServer implements Runnable {

    Socket socket;

    public MyServer(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try (Scanner scanner = new Scanner(socket.getInputStream());
             PrintWriter writer = new PrintWriter(socket.getOutputStream(), true)) {
            if (scanner.hasNextLine()) writer.println("You: " + scanner.nextLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
