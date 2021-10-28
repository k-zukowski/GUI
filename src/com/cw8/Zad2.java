package com.cw8;

import javax.swing.*;
import java.awt.*;

public class Zad2 extends JFrame {

    JPanel jp = new JPanel();
    JLabel label = new JLabel();
    JButton button = new JButton("Xem");

    JTextField textField = new JTextField(/*"def",*/7);
    public Zad2(){
        setTitle("Height calculator tool");
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        setSize(300-20,150-30);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        jp.add(new JLabel("Input your height "));
        jp.add(textField);

        textField.addActionListener((e) -> {
            String input = (textField.getText());
                    try {
                        if (Integer.parseInt(input)>0&&Integer.parseInt(input)<999)
                            new zad2result(input);
                        else label.setText("Wrong input");

                    }catch (NumberFormatException x){
                        x.printStackTrace();
                        System.out.println("Wrong input");
                    }
                }
        );
        jp.add(new JLabel("cm"));
        jp.add(button);
        button.addActionListener((e) -> {
            String input = (textField.getText());
            try {
                if (Integer.parseInt(input)>0&&Integer.parseInt(input)<999)
                    new zad2result(input);
                else label.setText("Wrong input");

            }catch (NumberFormatException x){
                x.printStackTrace();
                System.out.println("Wrong input");
            }
        }
        );

        jp.add(label);
        add(jp);


    }




}
