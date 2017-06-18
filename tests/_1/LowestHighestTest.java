package _1;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

/**
 * Created by Kuba on 17.06.2017.
 * Test of the first exercise implementation.
 */
public class LowestHighestTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outContent)); // Capture the system out stream to test results.
    }

    @Test
    public void testSortSolution() {
        LowestHighest LW = new LowestHighest(2, 3 ,1);
        LW.sortSolution();
        assertEquals("1 3", outContent.toString());
        System.setOut(null);
    }

    @Test
    public void testCompareSolution() {
        LowestHighest LW = new LowestHighest(2, 3 ,1);
        LW.compareSolution();
        assertEquals("1 3", outContent.toString());
        System.setOut(null);
    }

}