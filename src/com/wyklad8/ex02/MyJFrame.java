package com.wyklad8.ex02;

import com.wyklad8.MyFlowJPanel;
import com.wyklad8.MyGraphicsJComponent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJFrame extends JFrame {

    public MyJFrame(){
        setSize(1000,600);//nie tak ma byc pack
        setTitle("2nd frame");
        //getContentPane().setBackground(Color.darkGray);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*getContentPane().add(
                new MyGraphicsJComponent()*/
        JButton jb = new JButton("clickme !");

/*
        jb.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("clikced");
                    }
                }
        );
*/

        jb.addActionListener(
                (e)-> {
                    System.out.println("click");
                    System.out.println();
                }
        );

        add(jb);

        MyGenerator gen = new MyGenerator();


        MyColorListenerPanel mcp = new MyColorListenerPanel();
        add(mcp);
        gen.addColorListener(mcp);

        setVisible(true);
        pack();



    }

}
