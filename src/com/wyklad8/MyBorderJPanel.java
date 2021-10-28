package com.wyklad8;

import javax.swing.*;
import java.awt.*;

public class MyBorderJPanel extends JPanel {
    public MyBorderJPanel(){
        setLayout(new BorderLayout());
        add(new JButton("Center"),BorderLayout.CENTER);
        /*add(new JButton("North"),BorderLayout.NORTH);
        add(new JButton("South"),BorderLayout.SOUTH);
        add(new JButton("East"),BorderLayout.EAST);
        add(new JButton("West"),BorderLayout.WEST);*/


        add(new JButton("PAGE_START"),BorderLayout.PAGE_START);
        add(new JButton("PAGE_END"),BorderLayout.PAGE_END);
        add(new JButton("LINE_START"),BorderLayout.LINE_START);
        add(new JButton("LINE_END"),BorderLayout.LINE_END);


    }
}
