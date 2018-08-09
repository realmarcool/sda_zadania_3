package com.company;

public class Bmw extends Samochod {
    private Model model;

    public Bmw(Marki marka, Model model, String pojemnosc, RodzajSilnika silnik) {
        super(marka, pojemnosc, silnik);
        this.model = model;
    }
    @Override
    public String toString() {
        return getMarka() + " " + model + " " + getSilnik() + " " + getPojemnosc()+"cm3";
    }
}
