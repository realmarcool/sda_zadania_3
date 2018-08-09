package com.company;

public abstract class Samochod {
    private Marki marka;
    private String pojemnosc;
    private RodzajSilnika silnik;

    public Samochod(Marki marka, String pojemnosc, RodzajSilnika silnik) {
        this.marka = marka;
        this.pojemnosc = pojemnosc;
        this.silnik = silnik;
    }

    public Marki getMarka() {
        return marka;
    }

    public String getPojemnosc() {
        return pojemnosc;
    }

    public RodzajSilnika getSilnik() {
        return silnik;
    }
}
