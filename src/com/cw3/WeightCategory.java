package com.cw3;

public enum WeightCategory {
    light(0,61),
    middle(61.01,79),
    lightheavy(79.01,90.7),
    heavy(90.71,Double.MAX_VALUE),
    err();

    private double weightMin;
    private double weightMax;

    WeightCategory(double weightMin, double weightMax) {
        this.weightMin = weightMin;
        this.weightMax = weightMax;
    }
    WeightCategory(){};

    public double getWeightMin() {
        return weightMin;
    }

    public double getWeightMax() {
        return weightMax;
    }

    @Override
    public String toString() {
        return this.name();
    }
}
