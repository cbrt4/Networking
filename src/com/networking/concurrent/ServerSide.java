package com.networking.concurrent;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSide {

    public static void main(String[] args) throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(9999)) {
            while (true) {
                Socket socket = serverSocket.accept();
                new Thread(new MyServer(socket)).start();
            }
        }
    }
}
