package com.company;

import java.util.ArrayList;
import java.util.List;

public class Komis {
    private String nazwa;
    private String adres;
    private List <Samochod> lista;

    public Komis(String nazwa, String adres) {
        this.nazwa = nazwa;
        this.adres = adres;
        lista = new ArrayList<>();

    }
    public void dodajFure(Samochod samochod){
        lista.add(samochod);
    }

    public List<Samochod> getLista() {
        return lista;
    }

    @Override
    public String toString() {
        return nazwa + ", " + adres + ", " + "lista samochodów: " + lista;
    }
}
