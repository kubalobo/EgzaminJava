import _10.CopyFile;
import _12.Reader;
import _15.Ramka;
import _16.RamkaKlikalna;
import _9.Zgadnij;

import java.awt.*;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        //Zgadnij.start();
        //CopyFile.copy1("plik.txt", "1.txt");
//        Reader.czytaj3("plik.txt");

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ramka();
            }
        });

    }
}
