package com.cw2;

public class Kontrabas extends Strunowy implements Smyczkowe, Szarpane{
    int wysokosc;



    @Override
    public void skrzyp() {
        System.out.println("skrzyp");
    }

    @Override
    public void szarpnij() {
        System.out.println("szarp");
    }
}
