package _16;

import javax.swing.*;

/**
 * Created by Kuba on 22.06.2017.
 * 16. Napisz program, który tworzy ramkę aplikacji i reaguje na klikanie w jej wnętrzu przez
 * wypisanie na standardowe wyjście informacji o czasie i współrzędnych kliknięcia.
 */
public class RamkaKlikalna extends JFrame {
    public RamkaKlikalna() {
        setSize(1000, 1000);
        setVisible(true);
    }
}

/*public static void main(String[] args) throws IOException {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame ramka = new RamkaKlikalna();

                Container c = ramka.getContentPane();

                c.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        System.out.println(e.getX() + " " + e.getY() + " " + System.currentTimeMillis());
                    }
                });
            }
        });
    }
    */