package _6;

/**
 * Created by Kuba on 19.06.2017.
 * 6. Napisz metodą copyOf(), która otrzymuje jeden argument będący tablica typu int i zwracający kopię tej tablicy: public static int[] copyOf(int[] array)
 Napisz program testujący tę metodę.
 */
public class arrayCopy {
    public static int[] copyOf(int[] array) {
        int[] array2 = new int[array.length];
        //noinspection ManualArrayCopy
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }
        return array2;
    }
}
