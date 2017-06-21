package _6;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by Kuba on 19.06.2017.
 *
 */
public class arrayCopyTest {
    public void testArrayCopy () {
        int[] a1 = new int[] {1, 2, 3};
        int[] a2 = arrayCopy.copyOf(a1);
        assertArrayEquals(a1, a2);
    }
}