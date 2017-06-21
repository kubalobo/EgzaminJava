package _8;

/**
 * Created by Kuba on 19.06.2017.
 *
 */
public class Kalkulator {
    public Kalkulator(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        String z = args[2];

        if(z == "+")
            System.out.println( a + b );
        else if (z == "-")
            System.out.println( a - b );
        else if (z == "/")
            System.out.println( a / b );
        else
            System.out.println( a * b );
    }
}
