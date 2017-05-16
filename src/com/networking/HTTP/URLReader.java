package com.networking.HTTP;

import java.net.*;
import java.io.*;

public class URLReader {
    public static void main(String[] args) throws Exception {

        URL oracle = new URL("https://docs.oracle.com/javase/tutorial/networking/urls/readingURL.html");
        BufferedReader scanner = new BufferedReader(new InputStreamReader(oracle.openStream()));

        String inputLine;
        while ((inputLine = scanner.readLine()) != null)
            System.out.println(inputLine);
        scanner.close();
    }
}
