package com.cw8;

import com.wyklad8.MyJFrame;
import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

public class cw8 /*extends JPanel implements ActionListener*/ {
    /*static JLabel label;
    cw8(){}*/

    public static void main(String...args) throws InterruptedException {
        //new Zad1();
        SwingUtilities.invokeLater(
                ()->{

                    new Zad2();
                    //new zad2result();

                });

        System.out.println("1");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("2");

        /*JTextField textField = new JTextField(1);
        JFrame frame =new JFrame("textfiled");
        JLabel label =new JLabel("nothing enetered");
        JButton button = new JButton("submit");
        cw8 te = new cw8();
        button.addActionListener(te);

        JPanel jp = new JPanel();
        jp.add(textField);
        jp.add(button);
        jp.add(label);
        frame.add(jp);
        frame.setSize(400,300);
        frame.show();*/

        /*String s = JOptionPane.showInputDialog(null,"enteryour heint");
        System.out.println(s);*/



    }

    /*@Override
    public void actionPerformed(ActionEvent e) {
        int s= Integer.parseInt(e.getActionCommand());
        if (s>0&&s<999)label

    }*/
}
