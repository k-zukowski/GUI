package com.cw12;


import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class Sketch02 extends Component implements MouseListener, MouseMotionListener {

    int sX = -1, sY = -1;
    boolean dragging = false;
    int curX = -1, curY = -1;
    private  Color color;

    public static void main(String[] av) {

        JFrame jFrame = new JFrame("Mouse Dragger");

        Container cPane = jFrame.getContentPane();
        Sketch02 sk = new Sketch02();
        cPane.add(BorderLayout.CENTER, sk);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(800,800);
        jFrame.setVisible(true);

    }

    public Sketch02() {

        super();
        setSize(500, 800);

        addMouseListener(this);

        addMouseMotionListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent event) {
    }

    @Override
    public void mouseEntered(MouseEvent event) {
    }

    @Override
    public void mouseExited(MouseEvent event) {
    }

    @Override
    public void mousePressed(MouseEvent event) {

        Point point = event.getPoint();

        sX = point.x;

        sY = point.y;

        dragging = true;

    }

    @Override
    public void mouseReleased(MouseEvent event) {

        dragging = false;
    }

    @Override
    public void mouseDragged(MouseEvent event) {

        Point p = event.getPoint();

        curX = p.x;

        curY = p.y;

        if (dragging) {

            repaint();

        }
    }

    @Override
    public void paint(Graphics g) {
        int w = curX - sX, h = curY - sY;
        g.setColor(Color.red);
        //graphic.setColor((int)Math.random()*255, (int)Math.random()*255, (int)Math.random()*255);
        g.drawLine(sX,sY,curX,curY);
        g.fillRect(sX,sY,w,h);

    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }
}
