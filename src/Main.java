import _10.CopyFile;
import _11.Dir;
import _12.Reader;
import _15.Ramka;
import _16.RamkaKlikalna;
import _17.Grid;
import _18.Focus;
import _4.Pozycja;
import _4.Zamowienie;
import _9.Zgadnij;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame ramka = new Focus();

                ramka.addFocusListener(new FocusAdapter() {
                    public void focusGained(FocusEvent e) {
                        System.out.println("Jest FOCUS!");
                    }

                    @Override
                    public void focusLost(FocusEvent e) {
                        System.out.println("Brak fokusa :(");
                    }
                });
            }
        });
    }
}

