package com.cw2;

abstract class Pekusyjny extends Instrument{
    boolean czyOkreslonaWysDziwieku =true;



    @Override
    public String toString() {
        return "Pekusyjny{" +
                "waga=" + waga +
                ", skala=" + skala +
                ", nazwa='" + nazwa + '\'' +
                ", czyOkreslonaWysDziwieku=" + czyOkreslonaWysDziwieku +
                '}';
    }
    abstract void uderz();
}
