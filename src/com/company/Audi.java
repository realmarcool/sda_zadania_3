package com.company;

public class Audi extends Samochod {
    private Marki model;

    public Audi(String marka, String pojemnosc, Marki model) {
        super(marka, pojemnosc);
        this.model = model;
    }
}
