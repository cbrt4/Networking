package com.networking.single;

import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class NetworkingSocket {

    public static void main(String[] args) throws Exception {
        try (Socket socket = new Socket()) {
            socket.connect(new InetSocketAddress("localhost", 9999), 2000);
            Scanner scanner = new Scanner(new InputStreamReader(socket.getInputStream()));
            while (scanner.hasNextLine())
                System.out.println(scanner.nextLine());
        }
    }
}
