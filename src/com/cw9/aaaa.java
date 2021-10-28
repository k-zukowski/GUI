package com.cw9;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class aaaa extends JFrame {

    public aaaa() {
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setLocationRelativeTo(null);
        setDefaultLookAndFeelDecorated(true);
    }
    //@Override
    public void paintComponents(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        super.paintComponents(g);

        g2d.drawLine(0, 0, this.getHeight()-1, this.getWidth()-1);
        g2d.drawLine(this.getHeight()-1, 0, 0, this.getWidth()-1);

    }

/*
    public void paint(Graphics g) {
        super.paint(g);
        paintComponent(g);
    }
*/

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new aaaa().setVisible(true);
            }
        });

    }
}