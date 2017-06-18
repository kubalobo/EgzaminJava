package _4;

import org.junit.Test;

import javax.swing.table.TableRowSorter;

import static org.junit.Assert.*;

/**
 * Created by Kuba on 18.06.2017.
 * Klasa nic nie testuje - tylko instrukcja wywołania.
 */
public class ZamowieniaTest {
    @Test
    public void testZamowien() {
        Pozycja p1 = new Pozycja("Chleb", 1, 3.5);
        System.out.println(p1);
        Pozycja p2 = new Pozycja("Cukier", 3, 4);
        System.out.println(p2);
        Zamowienie z = new Zamowienie(20);
        z.dodajPozycje(p1);
        z.dodajPozycje(p2);
        System.out.println(z);
        assertTrue(true);   // zawsze prawda - test symboliczny
    }
}