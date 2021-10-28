package com.cw7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Writer extends Thread{

    private Buffor bu;
    private boolean flag = true;

    public Writer(Buffor bu) {
        this.bu = bu;
    }

    @Override
    public void run() {
        //List<String> list = new ArrayList<>();
        while (flag) {
            Scanner s = new Scanner(System.in);
            String ss = s.nextLine();
            if (ss.contains("stop")){
                break;
            }
            //list.add(ss);
            System.out.println("Writer napisal" +
                    " -> " + ss);
            bu.put(ss);
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
