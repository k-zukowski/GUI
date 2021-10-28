package com.cw2;

public class Marakasy extends Pekusyjny{
    String materialKorpusu;
    String wypelnienie;

    @Override
    public String toString() {
        return "Marakasy{" +
                "wypelnienie='" + wypelnienie + '\'' +
                ", waga=" + waga +
                ", skala=" + skala +
                ", nazwa='" + nazwa + '\'' +
                ", materialKorpusu='" + materialKorpusu + '\'' +
                ", czyOkreslonaWysDziwieku=" + czyOkreslonaWysDziwieku +
                '}';
    }

    @Override
    void uderz() {
        System.out.println("dzwiek marakasu");
    }
}
