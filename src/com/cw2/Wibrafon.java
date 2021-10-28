package com.cw2;

public class Wibrafon extends Pekusyjny{

    boolean czyMaSilniczek=true;



    @Override
    public String toString() {
        return "Wibrafon{" +
                "waga=" + waga +
                ", skala=" + skala +
                ", nazwa='" + nazwa + '\'' +
                ", czyOkreslonaWysDziwieku=" + czyOkreslonaWysDziwieku +
                ", czyMaSilniczek=" + czyMaSilniczek +
                '}';
    }

    @Override
    void uderz() {
        System.out.println("wibracja");
    }
}
