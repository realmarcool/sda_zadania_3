package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PrzetwarzanieMaila {
    private Scanner wczytajInt = new Scanner(System.in);
    private Scanner wczytajString = new Scanner(System.in);
    private int wybor = 0;
    private String poleString = "";

    private boolean sprawdzAdres(String adres) {
        String customerEmail = adres;

        Pattern p = Pattern.compile(".+@.+\\.[a-z]+");
        Matcher m = p.matcher(customerEmail);

        boolean matchFound = m.matches();
        if (!matchFound) {
            System.out.println("zły adres email");
        }
        return matchFound;
    }

    private <T extends Mail> void wyslijMail(T mail){
        System.out.println("MAIL WYSŁANY!");
    }


    public void przygotujMail() {
        MailTekstowy mailTekstowy = new MailTekstowy();
        System.out.println("Co chcesz zrobić:");
        System.out.println("1: Wyślij mail");
        wybor = wczytajInt.nextInt();
        if (wybor == 1) {
            do {
                System.out.println("Podaj adres na który ma wysłać mail");
                poleString = wczytajString.nextLine();
            }
            while (!sprawdzAdres(poleString));
            mailTekstowy.adresMailaOdbiorcy = poleString;
            System.out.println("Podaj temat maila:");
            poleString = wczytajString.nextLine();
            mailTekstowy.tematMaila = poleString;
            System.out.println("Napisz treść maila:");
            poleString = wczytajString.nextLine();
            mailTekstowy.setTrescMailaTxt(poleString);
            System.out.println(mailTekstowy);
            wyslijMail(mailTekstowy);
        }
    }
}
