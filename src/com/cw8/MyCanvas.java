package com.cw8;

import java.awt.*;

public class MyCanvas extends Canvas {
    public void paint(Graphics g){
        Toolkit t = Toolkit.getDefaultToolkit();
        Image i = t.getImage("C:\\Users\\kacpe\\Desktop\\IdeaProjects\\GUI\\src\\com\\cw8\\IMG_20210430_121516.jpg");
        g.drawImage(i,0,0,this);
    }
}
