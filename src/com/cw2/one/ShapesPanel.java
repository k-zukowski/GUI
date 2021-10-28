package com.cw2.one;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class ShapesPanel extends JPanel {
    private int x, y;


    public ShapesPanel() {
        int width = 600;
        int height = 400;

        this.x = width /2;//starting coords
        this.y = height /2;
        this.setSize(width, height);
        this.setBackground(Color.GRAY);
        MouseHandler mouseHandler = new MouseHandler();//mouse event handler
        this.addMouseListener(mouseHandler);
    }

    private class MouseHandler extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent event) {
            x = event.getX();
            y = event.getY();
            System.out.println(x + ", " + y);
            repaint();
        }
    }

    @Override
    public void paintComponent(Graphics gr) {
        super.paintComponent(gr);
        Graphics2D g2d = (Graphics2D) gr;//generating rand dimension && color of shape
        int r = Rand255();
        int g = Rand255();
        int b = Rand255();
        int width = Rand255()/*/5*/;
        int height = Rand255()/*/5*/;

        g2d.setColor(new Color(r, g, b));

        if (Math.random() > 0.5) {
            g2d.fillRect(x-(width/2), y-(height/2), width, height);//determining shape
        } else {
            g2d.fillOval(x-(width/2), y-(height/2), width, height);
        }
    }

    public int Rand255 (){
        Random r = new Random();
        return r.nextInt(255);
    }
}

