package com.cw6;

public class FirstThread implements Runnable{

    @Override
    public void run() {
        int a=10;

        for (int i = 0; i < a; i++) {
            System.out.println("a");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("end of a");
    }
}
