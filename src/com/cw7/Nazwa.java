package com.cw7;

public class Nazwa implements Runnable {

    protected long liczba;

    /*public Nazwa(long liczba) {
        this.liczba = liczba;
    }*/

    public long getLiczba() {
        return liczba;
    }

    public void incrementnormal(){
        this.liczba+=1L;
    }

    public synchronized void incrementsync(){
        this.liczba+=1L;
    }

    @Override
    public void run() {



    }
}
