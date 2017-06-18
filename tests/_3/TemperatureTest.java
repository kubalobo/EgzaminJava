package _3;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kuba on 18.06.2017.
 *
 */
public class TemperatureTest {
    @Test
    public void testTempConversion0() {
        Temperature temp = new Temperature(0);
        double tempF = temp.getFahrenheit();

        assertEquals(32.0d, tempF, 0);
    }

    @Test
    public void testTempConversion10() {
        Temperature temp = new Temperature(10);
        double tempF = temp.getFahrenheit();

        assertEquals(50.0d, tempF, 0);
    }
}