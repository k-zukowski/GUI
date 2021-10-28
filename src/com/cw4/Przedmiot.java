package com.cw4;

public class Przedmiot {
    protected  String nazwa;
    protected int ECTS;

    public Przedmiot(String nazwa, int ECTS) {
        this.nazwa = nazwa;
        this.ECTS = ECTS;
    }

    @Override
    public String toString() {
        return "Przedmiot{" +
                "nazwa='" + nazwa + '\'' +
                ", ECTS=" + ECTS +
                '}';
    }
}
