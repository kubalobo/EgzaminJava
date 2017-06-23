package _19;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Kuba on 22.06.2017.
 * 19. Napisz program serwera aplikacji typu Echo, który obsługuje klientów w osobnych wątkach.
 */
public class EchoServer {
    public static void main(String[] args) {
        ServerSocket serverSocket;
        try {
            serverSocket = new ServerSocket(12129);
        } catch (Exception e) {
            System.err.println("Create server socket: " + e);
            return;
        }
        while (true)
            try {
                Socket socket = serverSocket.accept();
                ClientHandler clieant = new ClientHandler(socket);
                clieant.start();
            } catch (Exception e) {
                System.err.println("Server exception: " + e);
            }
    }
}
