package de.merit.azubi;

public class Textaufgabe {

    public static void main(String[] args) {

 int anzahlTore = 0;
        int x = 3;

// ++ ist das selbe wie +1
        for (int zaehler = 1; zaehler <= 10; zaehler++) {

        anzahlTore = zaehler * x + anzahlTore;

            System.out.println(anzahlTore);
        }


        int a = 40;
        int b = 16;
        b = b + a;

        System.out.println(b);
    }

}
