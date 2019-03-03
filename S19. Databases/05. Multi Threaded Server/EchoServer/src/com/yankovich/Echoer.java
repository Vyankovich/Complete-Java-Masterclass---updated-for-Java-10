package com.yankovich;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * created by vyankovich on 03.03.2019
 */
public class Echoer extends Thread {
    private Socket socket;

    public Echoer(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            System.out.println("Client connected to " + Thread.currentThread().getName());
            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            while (true) {
                String echoString = input.readLine();
                System.out.println("Received client input from " + Thread.currentThread().getName() + ": " + echoString);
                if (echoString.equals("exit")) {
                    System.out.println("Client disconnected from " + Thread.currentThread().getName());
                    break;
                }
                output.println(echoString);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                //
            }
        }
    }
}
