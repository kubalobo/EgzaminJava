package _9;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Kuba on 19.06.2017.
 *
 */
public class Zgadnij {
    public static void start() {
        Random random = new Random();
        int a = random.nextInt(10);

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Zapodaj liczbe:");
            int liczba = input.nextInt();
            if (liczba == a)
                break;
            else if (liczba < a)
                System.out.println("Wincyj!");
            else if (liczba > a)
                System.out.println("Mnij!");
        }

        System.out.println("ZGADLES!");
    }
}
