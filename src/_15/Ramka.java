package _15;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Kuba on 22.06.2017.
 * 15. Napisz program, który tworzy ramkę aplikacji z użyciem pakietu AWT/Swing i rysuje w niej
 * prostokąt o wymiarach 100 na 100 pikseli.
 */
public class Ramka extends JFrame {
    public Ramka() {
        setSize(1000, 1000);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        g.drawRect(50,50,100,100);

//        set color to Green
//        g.setColor(Color.GREEN);
//        fill rectangle with GREEN color
//        g.fillRect(50,50,300,100);
    }
}

/*
public static void main(String[] args) throws IOException {
    EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ramka();
            }
        });

    }
 */