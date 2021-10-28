package com.cw2.one;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
    public GUI() {
        this.setTitle("GUI II");
        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null); //Okno będzie pojawiaś się na środku (o ile mamy jeden ekran)
        this.setLayout(new BorderLayout());
        JPanel panel = new ShapesPanel();
        this.add(panel);
        this.setVisible(true);
    }
}
