package _13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

/**
 * Created by Kuba on 23.06.2017.
 * 13. Napisz funkcję licznikZnakówISłów, która zlicza:
 1.       liczbę wszystkich znaków w pliku,
 2.       liczbę białych znaków w pliku (białe znaki to spacja, tabulator, znak końca wiersza),
 3.       liczbę słów w pliku.
 Wynikiem funkcji jest tablica złożona z 3 liczb całkowitych po jednej dla zliczanych elementów.

 */
public class Licznik {
    public static void main(String[] args) throws IOException {
        licz();
    }

    public static void licz() throws IOException {
        File plik = new File("plik.txt");
        FileInputStream stream = new FileInputStream(plik);
        int licznikZnakow = 0, licznikBialych = 0;

        char znak;
        //noinspection ConstantConditions
        while ((znak = (char) stream.read()) != -1) {
            licznikZnakow++;

            if (Character.isWhitespace(znak)) {
                licznikBialych++;
            }
        }

        Scanner skan = new Scanner(plik);
//        while ()

        System.out.println("Znaki: " + licznikZnakow);
        System.out.println("Biale znaki: " + licznikBialych);
//        System.out.println("Słowa: " + licznikSlow);
    }

}
