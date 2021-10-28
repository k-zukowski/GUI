package com.wyklad8;

import javax.swing.*;
import java.awt.*;

public class MyFlowJPanel extends JPanel {

    public MyFlowJPanel(){
        setLayout(new FlowLayout());
        for (int i = 0; i < 10; i++) {
            add(new JButton("Button " + i));
        }

    }

}
