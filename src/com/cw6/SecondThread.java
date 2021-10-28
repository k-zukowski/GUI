package com.cw6;

public class SecondThread extends Thread {

    @Override
    public void run() {
        int b=10;

        for (int i = 0; i < b; i++) {
            System.out.println("b");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("end of b");
    }
}
