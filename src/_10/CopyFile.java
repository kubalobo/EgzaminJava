package _10;

import java.io.*;

/**
 * Created by Kuba on 22.06.2017.
 */
public class CopyFile {
    public static void copy1(String nazwa1, String nazwa2) throws IOException {
        File plik = new File(nazwa1);
        FileInputStream stream = new FileInputStream(plik);

        File plik2 = new File(nazwa2);
        FileOutputStream stream2 = new FileOutputStream(plik2);

        int znak;
        while ((znak = stream.read()) != -1) {
            stream2.write(znak);
        }
    }

    public static void copy2(String nazwa1, String nazwa2) throws IOException {
        File plik = new File(nazwa1);
        FileInputStream stream = new FileInputStream(plik);
        BufferedInputStream bStream = new BufferedInputStream(stream);

        File plik2 = new File(nazwa2);
        FileOutputStream stream2 = new FileOutputStream(plik2);
        BufferedOutputStream bStream2 = new BufferedOutputStream(stream2);


        while (bStream.available() > 0) {
            bStream2.write(bStream.read());
        }

        bStream2.flush();
    }
}
