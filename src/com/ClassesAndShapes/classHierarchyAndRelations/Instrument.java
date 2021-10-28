package com.ClassesAndShapes.classHierarchyAndRelations;

public abstract class Instrument {
    protected String nazwa;
    protected float waga;
    protected int skala;



    @Override
    public String toString() {
        return "Instrument{" +
                "waga=" + waga +
                ", skala=" + skala +
                ", nazwa='" + nazwa + '\'' +
                '}';
    }
}
