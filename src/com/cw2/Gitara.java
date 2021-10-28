package com.cw2;

public class Gitara extends Strunowy implements Szarpane{
    public enum Rodzaj{
        A,B,C
    }
    Rodzaj rodzaj;

    @Override
    public String toString() {
        return "Gitara{" +
                "rodzaj='" + rodzaj + '\'' +
                ", liczbaStrun=" + liczbaStrun +
                '}';
    }

    @Override
    public void szarpnij() {
        System.out.println("szarp");
    }
}
