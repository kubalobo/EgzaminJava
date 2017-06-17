package two;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Created by Kuba on 17.06.2017.
 *
 */
public class TaxTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private ByteArrayInputStream in = new ByteArrayInputStream("85529".getBytes());

    @Before
    public void preTest() {
        System.setOut(new PrintStream(outContent));
        System.setIn(in);
    }

    @Test
    public void taxTest(){
        Tax t = new Tax();
        t.taxCalculator();
        assertEquals("15395,36", outContent.toString());
    }
}
