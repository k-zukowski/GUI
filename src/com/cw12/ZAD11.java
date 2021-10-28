package com.cw12;

import javax.swing.*;
import java.awt.*;

public class ZAD11
extends JFrame {

    public ZAD11(){
        this.setLayout(new GridLayout(1, 2, 10, 10));
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setTitle("Word wanna be");

        JPanel editPanel = new JPanel();
        editPanel.setLayout(new GridLayout(4, 2, 8, 8));
        editPanel.setBorder(BorderFactory.createEmptyBorder(10, 2, 10, 10));

        JPanel textPanel = new JPanel();
        textPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 2));

        JTextArea textArea = new JTextArea(8, 24);
        textArea.setFont(new Font("Arial", Font.BOLD, 16));
        JScrollPane scroll = new JScrollPane(textArea);
        textPanel.add(scroll, BorderLayout.CENTER);
        this.getContentPane().add(textPanel);
        this.getContentPane().add(editPanel);

        this.pack();
        this.setVisible(true);


    }

}
