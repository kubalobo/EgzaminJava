package two;

import java.util.Scanner;

/**
 * Created by Kuba on 17.06.2017.
 *
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
