package com.wyklad8;

import javax.swing.*;
import java.awt.*;

public class MyJFrame extends JFrame {

    public MyJFrame(){
        setSize(1000,600);//nie tak ma byc pack
        setTitle("2nd frame");
        //getContentPane().setBackground(Color.darkGray);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*getContentPane().add(
                new MyGraphicsJComponent()
        );*/
        JPanel jp = new JPanel();
        jp.setLayout(new FlowLayout());
        jp.add(new MyGraphicsJComponent());
        jp.add(new JLabel("Text"));
        //add(jp);

        //add(new MyBorderJPanel());
        add(new MyFlowJPanel());

        /*add(
             new MyGraphicsJComponent()
        );
        add(
             new JLabel("Text")
        );*/

        setVisible(true);
        pack();



    }

}
