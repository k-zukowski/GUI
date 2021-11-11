package com.Boxer;

import java.util.Comparator;

public class Boxer implements Comparable<Boxer>, Comparator<Boxer> {

    private String surname;
    private double weight, height;
    private WeightCategory weightCategory;

    public Boxer(String surname, double weight, double height) {
        this.surname = surname;
        this.weight = weight;
        this.height = height;
        this.weightCategory = this.assignWeightCategory();
    }
    /*
       private weightCategory assignWeightCategory(){
          if (this.weight>=WeightCategory.light.getweightMin()&&this.weight<=WeightCategory.light.getWeightMax())return WeightCategory.light;
          else if (this.weight>=61.1&&this.weight<=79)return WeightCategory.middle;
          else if (this.weight>=79.1&&this.weight<=90.7)return WeightCategory.lightHeavy;
          else if (this.weight>=90.71&&this.weight<=Double.MAX_VALUE)return WeightCategory.heavy;
          else return WeightCategory.err;
       }
    */
    private WeightCategory assignWeightCategory(){
        for( WeightCategory wc : WeightCategory.values()){
            if (wc.getWeightMax()>this.weight) return wc;
        }
        return WeightCategory.err;
    }



    @Override
    public String toString() {
        return "Boxer{" +
                "height=" + height +
                ", weight=" + weight +
                ", surname='" + surname + '\'' +
                ", weightCategory=" + weightCategory +
                '}';
    }

    @Override
    public int compareTo(Boxer o) {
        if (this.weight > o.weight){
            return 1;
        }else {
            return -1;
        }
    }

    @Override
    public int compare(Boxer o1, Boxer o2) {
        if (o1.weight > o2.weight){
            return 1;
        }else {
            return -1;
        }
    }
}
