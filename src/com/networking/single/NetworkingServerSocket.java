package com.networking.single;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class NetworkingServerSocket {

    public static void main(String[] args) throws Exception {
        try (ServerSocket serverSocket = new ServerSocket(9999);
             Socket socket = serverSocket.accept()) {
            Scanner scanner = new Scanner(socket.getInputStream());
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            //writer.println("Hello from server =)");
            while (scanner.hasNextLine()) {
                String string = scanner.nextLine();
                System.out.println(string);
                writer.println("You: " + string);
                if (string.equals("exit")) break;
            }
        }
    }
}
