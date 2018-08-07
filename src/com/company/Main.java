package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code herej
        Scanner wczytaj = new Scanner(System.in);
        int menu = 0;
        System.out.println("Podaj program do wykonania: \n1: Mail\n2: Komis");
        menu = wczytaj.nextInt();
        switch (menu) {
            case 1:
                PrzetwarzanieMaila mail = new PrzetwarzanieMaila();
                mail.przygotujMail();
                break;
            case 2:
                // tu bedzie komis


                break;
        }
    }
}
