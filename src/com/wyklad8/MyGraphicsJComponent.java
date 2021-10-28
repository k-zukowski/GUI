package com.wyklad8;

import javax.swing.*;
import java.awt.*;

public class MyGraphicsJComponent extends JComponent {

    public MyGraphicsJComponent(){
        setBackground(Color.MAGENTA);
    }

    public Dimension getPreferredSize(){
        return new Dimension(
                400,400
        );
    }

    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.ORANGE);
        g2d.setFont(
                new Font("QuickSand" ,Font.BOLD,29)
        );
        g2d.drawString("Hello Swing", 200,200);
    }

}
