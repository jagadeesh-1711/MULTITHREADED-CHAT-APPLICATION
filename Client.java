import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        String serverAddress = "localhost";
        int port = 1234;

        try (
            Socket socket = new Socket(serverAddress, port);
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader console = new BufferedReader(new InputStreamReader(System.in))
        ) {
            System.out.println("Connected to chat server");

            Thread readerThread = new Thread(() -> {
                try {
                    String serverMessage;
                    while ((serverMessage = input.readLine()) != null) {
                        System.out.println("Server: " + serverMessage);
                    }
                } catch (IOException e) {
                    System.out.println("Connection closed.");
                }
            });
            readerThread.start();

            String userInput;
            while ((userInput = console.readLine()) != null) {
                output.println(userInput);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}