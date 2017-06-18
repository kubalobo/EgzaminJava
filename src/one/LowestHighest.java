package one;

import java.util.Arrays;

/**
 * Created by Kuba on 17.06.2017.
 * Napisz program wczytujący 3 liczby całkowite, który wypisze najmniejszą i największą z nich.
 */
public class LowestHighest {
    private int[] numbers = new int[3];

    LowestHighest(int a, int b, int c) {
        numbers = new int[] {a, b, c};
    }

    public void sortSolution() {
        Arrays.sort(numbers);
        System.out.print(numbers[0] + " " + numbers[2]);
    }

    public void compareSolution() {
        int min = 99999, max = -99999;
        for (int number : numbers) {
            if (min > number)
                min = number;
            if (max < number)
                max = number;
        }
        System.out.print(min + " " + max);
    }
}
