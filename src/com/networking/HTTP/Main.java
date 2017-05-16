package com.networking.HTTP;

import java.io.*;
import java.net.*;

public class Main {
    public static void main(String[] args) throws IOException {

        URLConnection connection = new URL("http://www.brainacad.com/").openConnection();
        BufferedReader scanner = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        String inputLine;
        while ((inputLine = scanner.readLine()) != null)
            System.out.println(inputLine);
        scanner.close();
    }
}
