package com.wyklad8;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

       /* EventQueue.invokeLater(
                ()->{
                    JFrame jFrame = new JFrame();
                    jFrame.setSize(400,300);

                    jFrame.setVisible(true);
                }
        );*/

/*
        SwingUtilities.invokeLater(
                ()->{
                    JFrame jFrame = new JFrame();
                    jFrame.setSize(400,300);
                    jFrame.setTitle("1st frame");
                    //jFrame.setBackground(Color.DARK_GRAY);
                    jFrame.getContentPane().setBackground(Color.darkGray);
                    jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
                    jFrame.setVisible(true);
                }
        );
*/
        SwingUtilities.invokeLater(
                ()->{

                    new MyJFrame();

                });


    }
}
