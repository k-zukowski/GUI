package com.cw8;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class zad2result extends JFrame {
    public zad2result(String ass){
        JPanel jp = new JPanel();
        JLabel jl = new JLabel();
        JButton jb = new JButton("OK");
        setTitle("Result");
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        setSize(300,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        jp.add(new JLabel("Your height is "));
        jp.add(new JLabel(ass));
        jp.add(new JLabel("cm!"));
        jp.add(jb);
        jb.addActionListener((e -> {
            MyCanvas mc = new MyCanvas();
            JFrame jf = new JFrame();
            jf.add(mc);
            jf.setSize(867,1084);
            jf.setVisible(true);
            jf.setResizable(false);
            jf.setLocationRelativeTo(null);
            jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
            Timer timer =  new Timer(1000,e1 -> {
                System.exit(0);

            });
            timer.start();

            //System.exit(0);
        }));

        jp.add(jl);
        add(jp);


    }
}
