package com.textfileReadANDMaps;

public class Subject {
    protected  String name;
    protected int ECTS;

    public Subject(String name, int ECTS) {
        this.name = name;
        this.ECTS = ECTS;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", ECTS=" + ECTS +
                '}';
    }
}
