package com.cw9;

import javax.swing.*;
import java.awt.*;

public class ZAD33 {
    ZAD33(){
        String a = (String) JOptionPane.showInputDialog(null,"choose layout" ,"ZAD3",JOptionPane.QUESTION_MESSAGE,null,new Object[]{"A","B","C","D"},"def");
        switch (a){
            case "A"-> new BorderLayout();
            case "B"-> new GridLayout();
            case "C"-> new GridLayout();
            case "D"-> new GridLayout();
        }

    }
}
