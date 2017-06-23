package _10;

import java.io.*;

/**
 * Created by Kuba on 22.06.2017.
 * 10. Napisz program typu copy (cp), o parametrach:
 copy [nazwa_pliku1] [nazwa_pliku2] który kopiuje plik [nazwa_pliku1] na plik [nazwa_pliku2].
 Program napisz w kilku wersjach:
 1.       Odczyt/zapis niebuforowany (klasy FileInputStream/FileOutputStream)
 2.       Odczyt/zapis buforowany z buforami o wielkości domyślnej (klasy
 BufferedInputStream/BufferedOutputStream i konstruktory z jednym argumentem)
 3.       Odczyt/zapis buforowany z buforami o wielkości 512 bajtów (klasy
 BufferedInputStream/BufferedOutputStream i konstruktory z dwoma argumentami, drugi 512)
 4.       Odczyt/zapis buforowany z buforami o wielkości 4 kB (klasy
 BufferedInputStream/BufferedOutputStream i konstruktory z dwoma argumentami)
 5.       Odczyt/zapis buforowany, nieblokujący, z użyciem kanałów (java.nio.channels.FileChannel)

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

    public static void copy3(String nazwa1, String nazwa2) throws IOException {
        File plik = new File(nazwa1);
        FileInputStream stream = new FileInputStream(plik);
        BufferedInputStream bStream = new BufferedInputStream(stream, 512);

        File plik2 = new File(nazwa2);
        FileOutputStream stream2 = new FileOutputStream(plik2);
        BufferedOutputStream bStream2 = new BufferedOutputStream(stream2, 512);


        while (bStream.available() > 0) {
            bStream2.write(bStream.read());
        }

        bStream2.flush();
    }

    public static void copy5(String nazwa1, String nazwa2) throws IOException {

    }
}
