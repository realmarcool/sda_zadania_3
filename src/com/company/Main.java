package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner wczytaj = new Scanner(System.in);
        Random losowanko = new Random();
        List <Komis> listaKomisow = new ArrayList<>();
        int menu = 0;
        int pomocnicza;
        System.out.println("Podaj program do wykonania: \n1: Mail\n2: Komis");
        menu = wczytaj.nextInt();
        switch (menu) {
            case 1: //Mail
                PrzetwarzanieMaila mail = new PrzetwarzanieMaila();
                mail.przygotujMail();
                break;
            case 2: //Komis
                Map <Integer, Samochod> tymczasowa = new HashMap<>();
                Audi audi1 = new Audi(Marki.AUDI, Model.A1, "2000", RodzajSilnika.BENZYNA);
                tymczasowa.put(1,audi1);
                Audi audi2 = new Audi(Marki.AUDI, Model.A2, "2000", RodzajSilnika.DIESEL);
                tymczasowa.put(2,audi2);
                Audi audi3 = new Audi(Marki.AUDI, Model.A3, "2000", RodzajSilnika.BENZYNA);
                tymczasowa.put(3,audi3);
                Audi audi4 = new Audi(Marki.AUDI, Model.A4, "2000", RodzajSilnika.DIESEL);
                tymczasowa.put(4,audi4);
                Audi audi5 = new Audi(Marki.AUDI, Model.A5, "2000", RodzajSilnika.BENZYNA);
                tymczasowa.put(5,audi5);
                Audi audi6 = new Audi(Marki.AUDI, Model.A6, "2000", RodzajSilnika.DIESEL);
                tymczasowa.put(6,audi6);
                Audi audi7 = new Audi(Marki.AUDI, Model.A7, "2000", RodzajSilnika.BENZYNA);
                tymczasowa.put(7,audi7);
                Audi audi8 = new Audi(Marki.AUDI, Model.A8, "2000", RodzajSilnika.DIESEL);
                tymczasowa.put(8,audi8);
                Audi audi9 = new Audi(Marki.AUDI, Model.Q5, "2000", RodzajSilnika.BENZYNA);
                tymczasowa.put(9,audi9);
                Audi audi10 = new Audi(Marki.AUDI, Model.Q3, "2000", RodzajSilnika.DIESEL);
                tymczasowa.put(10,audi10);
                Bmw bmw1 = new Bmw(Marki.BMW, Model.SERIA1, "2000", RodzajSilnika.BENZYNA);
                tymczasowa.put(11,bmw1);
                Bmw bmw2 = new Bmw(Marki.BMW, Model.SERIA2, "2000", RodzajSilnika.DIESEL);
                tymczasowa.put(12,bmw2);
                Bmw bmw3 = new Bmw(Marki.BMW, Model.SERIA3, "2000", RodzajSilnika.BENZYNA);
                tymczasowa.put(13,bmw3);
                Bmw bmw4 = new Bmw(Marki.BMW, Model.SERIA4, "2000", RodzajSilnika.DIESEL);
                tymczasowa.put(14,bmw4);
                Bmw bmw5 = new Bmw(Marki.BMW, Model.SERIA5, "2000", RodzajSilnika.BENZYNA);
                tymczasowa.put(15,bmw5);
                Bmw bmw6 = new Bmw(Marki.BMW, Model.SERIA6, "2000", RodzajSilnika.DIESEL);
                tymczasowa.put(16,bmw6);
                Bmw bmw7 = new Bmw(Marki.BMW, Model.SERIA7, "2000", RodzajSilnika.BENZYNA);
                tymczasowa.put(17,bmw7);
                Bmw bmw8 = new Bmw(Marki.BMW, Model.SERIA8, "2000", RodzajSilnika.DIESEL);
                tymczasowa.put(18,bmw8);
                Bmw bmw9 = new Bmw(Marki.BMW, Model.M3, "3000", RodzajSilnika.BENZYNA);
                tymczasowa.put(19,bmw9);
                Bmw bmw10 = new Bmw(Marki.BMW, Model.M5, "3000", RodzajSilnika.DIESEL);
                tymczasowa.put(20,bmw10);

                //Stworzenie listy tymczasowej samochodów
                List <Samochod> tymczasowaListaSamochodow = new ArrayList<>(Arrays.asList(audi1,audi2,audi3,audi4,audi5,audi6,audi7,audi8,audi9,audi10,
                        bmw1,bmw2,bmw3,bmw4,bmw5,bmw6,bmw7,bmw8,bmw9,bmw10));

                //Stworzenie dwóch komisów:
                Komis komis1 = new Komis("Komis Pierwszy", "Szczecin");
                Komis komis2 = new Komis("Komis Drugi", "Koszalin");

                //Losowe dodanie utworzonych samochodów do dwóch komisów:
                for (Samochod furka: tymczasowaListaSamochodow){
                    pomocnicza = losowanko.nextInt(2);
                    if (pomocnicza == 1){
                        komis1.dodajFure(furka);
                    }
                    else {
                        komis2.dodajFure(furka);
                    }
                }
                System.out.println("Lista samochodów w poszczególnych komisach:");
                System.out.println(komis1);
                System.out.println(komis2);
                System.out.println("------------------------------------------------------------");

                //Zrobienie listy komisów:
                listaKomisow.add(komis1);
                listaKomisow.add(komis2);

                //Stworzenie ogólnej mapy marka-model oraz dwóch pomocniczych list:
                Map<Marki, List<Samochod>> map = new HashMap<>();
                List<Samochod> listaAudi = new ArrayList<>();
                List<Samochod> listaBMW = new ArrayList<>();

                //Wypełnienie pomocniczych list:
                for (Komis lista: listaKomisow ) {
                    for (Samochod furki : lista.getLista()) {
                        if (furki.getMarka() == Marki.AUDI) {
                            listaAudi.add(furki);
                        }
                        else if (furki.getMarka() == Marki.BMW) {
                            listaBMW.add(furki);
                        }
                    }
                }

                //Wypełnienie mapy:
                map.put(Marki.AUDI, listaAudi);
                map.put(Marki.BMW, listaBMW);

                System.out.println("Lista modeli marki Audi dostępnych w obu komisach: \n" + map.get(Marki.AUDI));
                System.out.println("");
                System.out.println("Lista modeli marki BMW dostępnych w obu komisach: \n" + map.get(Marki.BMW));
                System.out.println("------------------------------------------------------------");

                break;
        }
    }
}
