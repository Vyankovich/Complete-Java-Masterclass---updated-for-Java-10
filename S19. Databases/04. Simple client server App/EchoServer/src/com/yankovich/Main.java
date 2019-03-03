package com.yankovich;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            Socket socket = serverSocket.accept(); // accept method's gonna block into a client that connect to the server
            System.out.println("Client connected");
            // a common practise here is to wrap the input string with a buffered reader
            //  and to wrap the output string with a print writer
            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            // we want the server to remain alive until the client doesn't need it anymore,
            //so this is one time where we will actually intensely use an Infinite loop.
            //So let's go ahead and write that.
            while (true) {
                String echoString = input.readLine();
                if (echoString.equals("exit")) {
                    break;
                }
                output.println("Echo from server: " + echoString);
            }

        } catch (IOException e) {
            System.out.println("Server exception " + e.getMessage());
        }
    }
}
