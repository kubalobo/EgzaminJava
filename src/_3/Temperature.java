package _3;

/**
 * Created by Kuba on 18.06.2017.
 * Napisz program konwertujący wartości temperatury w stopniach Celsjusza na stopnie w skali
 Fahrenheita (stopnie Fahrenheita = 1.8 * stopnie Celsjusza + 32.0).
 */
public class Temperature {
    double celsius;
    Temperature(double t) {
        celsius = t;
    }

    double getFahrenheit () {
        return celsius * 1.8 + 32;
    }
}
