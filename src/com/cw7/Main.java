package com.cw7;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Thread timer = new Timer();

        timer.start();
        new Main();
        timer.interrupt();
        Buffor b= new Buffor();
        Writer a= new Writer(b);
        a.start();
        a.join();

    }

    public Main() throws InterruptedException{

        Nazwa ex = new Nazwa();

        Thread t1 = new Thread(() ->{
            Thread t21 = new Thread(() -> {

                Thread t31 = new Thread(() -> {
                    for (int i = 0; i < 50000; i++) {
                        ex.incrementnormal();
                    }

                });

                Thread t32 = new Thread(() -> {
                    for (int i = 0; i < 50000; i++) {
                        ex.incrementnormal();
                    }
                });
                t31.start();
                t32.start();
                try {
                    t31.join();
                    t32.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            });


            Thread t22 = new Thread(() -> {

                Thread t33 = new Thread(() -> {
                    for (int i = 0; i < 50000; i++) {
                        ex.incrementsync();
                    }
                });

                Thread t34 = new Thread(() -> {
                    for (int i = 0; i < 50000; i++) {
                        ex.incrementsync();
                    }
                });

                t33.start();
                t34.start();
                try {
                    t33.join();
                    t34.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            });
            t21.start();
            t22.start();

            try {
                t21.join();
                t22.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t1.join();
        System.out.println(ex.getLiczba());

    }



}
