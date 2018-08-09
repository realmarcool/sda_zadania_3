package com.company;

public class Audi extends Samochod {
    private Model model;

    public Audi(Marki marka, Model model, String pojemnosc, RodzajSilnika silnik) {
        super(marka, pojemnosc, silnik);
        this.model = model;
    }

    @Override
    public String toString() {
        return getMarka() + " " + model + " " + getSilnik() + " " + getPojemnosc()+"cm3";
    }
}
