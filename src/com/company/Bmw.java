package com.company;

public class Bmw extends Samochod {
    private Marki model;

    public Bmw(String marka, String pojemnosc, Marki model) {
        super(marka, pojemnosc);
        this.model = model;
    }
}
