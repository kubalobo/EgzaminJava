package _5;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Kuba on 19.06.2017.
 *5. Zapisz metodę aequals(), typu boolean, która otrzymuje dwa argumenty będące tablicami typu int, zwracającą true jeśli obie tablice są sobie równe, tj. mają tę sama długość i taką samą zawartość, a false w przeciwnym przypadku:
 public static boolean aequals(int[] array1, int[] array2) Napisz program testujący tę metodę.
 */
public class Aequals {
    public static boolean aequals(int[] array1, int[] array2) {
        return Arrays.equals(array1, array2);
    }
}
