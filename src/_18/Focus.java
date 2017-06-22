package _18;

import javax.swing.*;

/**
 * Created by Kuba on 22.06.2017.
 * 18. Napisz przykładowy program obsługujący zdarzenia focusGained i focusLost.
 */
public class Focus extends JFrame {
    public Focus() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(1000, 1000);
        setVisible(true);
    }
}

/*
    public static void main(String[] args) throws IOException {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame ramka = new Focus();

                ramka.addFocusListener(new FocusAdapter() {
                    @Override
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
 */