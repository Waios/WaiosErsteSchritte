package de.merit.azubi;

public class Tore {

    public static void main(String[] args) {

        int tore = 3;
        int anzahlTore = 0;


        for (int zaehler = 1; zaehler <= 5; zaehler++) {

            anzahlTore = zaehler * tore;

        }

        System.out.println(anzahlTore);
    }
}
