package com.company;

import java.util.List;

public class Komis {
    private String nazwa;
    private String adres;
    private List <Samochod> lista;

    public Komis(String nazwa, String adres) {
        this.nazwa = nazwa;
        this.adres = adres;

    }
    public void dodajFure(Samochod samochod){
        lista.add(samochod);
    }

    public List<Samochod> getLista() {
        return lista;
    }
}
