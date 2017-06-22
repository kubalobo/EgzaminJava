import _10.CopyFile;
import _12.Reader;
import _15.Ramka;
import _16.RamkaKlikalna;
import _17.Grid;
import _9.Zgadnij;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame ramka = new Grid();
            }
        });
    }
}
