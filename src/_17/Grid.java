package _17;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Kuba on 22.06.2017.
 */
public class Grid extends JFrame {
    public Grid() {
        setSize(1000, 1000);
        setVisible(true);
        setLayout(new GridLayout(3, 2));
        add(new JButton("asdf"));
        add(new JButton("asdf"));
        add(new JButton("asdf"));
        add(new JButton("asdf"));
        add(new JButton("asdf"));
    }
}
