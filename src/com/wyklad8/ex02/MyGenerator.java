package com.wyklad8.ex02;

import java.awt.*;
import java.util.ArrayList;

public
    class MyGenerator
    implements Runnable{

    Thread thread;

    public MyGenerator(){
    this.thread= new Thread(this);
    this.thread.start();
    }

    @Override
    public void run() {

        while (!Thread.currentThread().isInterrupted()){
            System.out.println("new color generated");
            Color color = new Color(
                    (int)Math.random()*255,
                    (int)Math.random()*255,
                    (int)Math.random()*255
                    );
            fireColorChange(
            new ColorEvent(this,color)
            );

            try {
                Thread.currentThread().sleep(2500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

    private ArrayList<ColorListenert> al = new ArrayList<>();


    public void addColorListener(ColorListenert cl){
    al.add(cl);
    }
    private  void fireColorChange (ColorEvent e ){
        synchronized (thread){
            for (ColorListenert cl :al){
                cl.colorChange(e);
            }
        }
    }

}
