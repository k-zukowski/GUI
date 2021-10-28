package com.wyklad8.ex02;

import javax.swing.*;

public class MyColorListenerPanel extends JPanel implements ColorListenert{


    @Override
    public void colorChange(ColorEvent ev) {
        this.setBackground(ev.getColor());
        this.repaint();
    }
}
