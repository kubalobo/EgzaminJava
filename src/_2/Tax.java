package _2;

import java.util.Scanner;

/**
 * Created by Kuba on 17.06.2017.
 *Napisz program obliczający należny podatek dochodowy. Program pobiera od użytkownika
 dochód, następnie oblicza podatek wg skali:
 - dochód do 85528 zł – 18% minus kwota 556,02 zł,
 - dochód powyżej 85528 zł – 15395,04 zł plus 32% nadwyżki ponad 85528 zł.
 */
public class Tax {
    public void taxCalculator() {
        Scanner input = new Scanner(System.in);
        double income = Double.parseDouble(input.nextLine());
        Double tax = 0d;

        if(income <= 85528){
            tax += 85528 * 0.18 - 556.02;
        }
        else {
            tax = 15395.04 + 0.32 * (income - 85528);
        }

        System.out.printf("%.2f", tax);
    }

}
