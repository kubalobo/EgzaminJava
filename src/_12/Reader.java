package _12;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

import static java.io.StreamTokenizer.TT_EOF;

/**
 * Created by Kuba on 22.06.2017.
 */
public class Reader {

    public static void czytaj1(String nazwa1) throws IOException {
        File file = new File(nazwa1);

        FileInputStream stream = new FileInputStream(file);
        StreamTokenizer streamT = new StreamTokenizer(stream);

        while (streamT.nextToken() != TT_EOF) {
            System.out.println(streamT.sval);
        }
    }
    public static void czytaj2 (String nazwa1) throws IOException {

        BufferedReader buffer = new BufferedReader(new FileReader(nazwa1));
        String line = buffer.readLine();
        StringTokenizer st = new StringTokenizer(line);
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }

    public static void czytaj3 (String nazwa1) throws IOException {

        Scanner skan = new Scanner(new File(nazwa1));

        while (skan.hasNext()) {
            System.out.println(skan.next());
        }
    }
}