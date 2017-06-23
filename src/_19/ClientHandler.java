package _19;

import java.io.*;
import java.net.Socket;

/**
 * Created by Kuba on 23.06.2017.
 *
 */
public class ClientHandler extends Thread {

    Socket socket;

    ClientHandler(Socket s) {
        socket = s;
    }

    @Override
    public void run() {
        InputStream is = null;
        try {
            is = socket.getInputStream();
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(is));
            OutputStream os = socket.getOutputStream();
            PrintWriter pw = new PrintWriter(os, true);
            String fromClient = br.readLine();
            System.out.println("From client: [" + fromClient + "]");
            pw.println("Echo: " + fromClient);
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
