package _19;

import java.io.*;
import java.net.Socket;

/**
 * Created by Kuba on 22.06.2017.
 */
public class EchoClient {
    public static void main(String args[]) {
        try {
            Socket socket = new Socket("localhost", 12129);
            OutputStream os = socket.getOutputStream();
            PrintWriter pw = new PrintWriter(os, true);
            pw.println("Hello server!");
            InputStream is = socket.getInputStream();
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(is));
            System.out.println(br.readLine());
            socket.close();
        } catch (Exception e) {
            System.err.println("Client exception: " + e);
        }
    }
}
