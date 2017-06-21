package _7;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

/**
 * Created by Kuba on 19.06.2017.
 *
 */
public class StatystykiOcenTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outContent)); // Capture the system out stream to test results.
    }

    @Test
    public void testOcen() {
        Integer[] oceny = new Integer[] {1, 3, 6};
        StatystykiOcen so = new StatystykiOcen(oceny);
        assertEquals(3, so.average(), 0);
    }

    @Test
    public void testMinMax() {
        Integer[] oceny = new Integer[] {1, 3, 6};
        StatystykiOcen so = new StatystykiOcen(oceny);

        assertEquals(1, so.min(), 0);
        assertEquals(6, so.max(), 0);
    }

    @Test
    public void testMediana() {
        Integer[] oceny = new Integer[] {1, 3, 6};
        StatystykiOcen so = new StatystykiOcen(oceny);

        assertEquals(3, so.mediana(), 0);
    }

    @Test
    public void testOdchylenie() {
        Integer[] oceny = new Integer[] {1, 3, 6};
        StatystykiOcen so = new StatystykiOcen(oceny);

        assertEquals(1.5, so.odchylenie(), 0);
    }

}