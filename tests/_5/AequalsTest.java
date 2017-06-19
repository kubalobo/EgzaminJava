package _5;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kuba on 19.06.2017.
 *
 */
public class AequalsTest {

    @Test
    public void test1Aequals() {
        int[] t1 = new int[] {1, 2, 3};
        int[] t2 = new int[] {1, 2, 3};
        assertTrue(Aequals.aequals(t1, t2));
    }

    @Test
    public void test2Aequals() {
        int[] t1 = new int[] {1, 2, 3};
        int[] t2 = new int[] {4, 5, 6};
        assertFalse(Aequals.aequals(t1, t2));
    }

}