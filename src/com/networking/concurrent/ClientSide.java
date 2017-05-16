package com.networking.concurrent;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientSide {

    public static void main(String[] args) throws IOException {
        try (Socket socket = new Socket()) {
            socket.connect(new InetSocketAddress(InetAddress.getLocalHost(), 9999), 3000);
            Scanner scanner = new Scanner(new InputStreamReader(socket.getInputStream()));
            while (scanner.hasNextLine())
                System.out.println(scanner.nextLine());
        }
    }
}
