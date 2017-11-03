package de.merit.azubi;

public class Bruchrechnen {

    public static void main(String[] args) {

        Bruch a = new Bruch();

        a.zaehler = 3;
        a.nenner = 4;
        a.erweitert = 5;

        a.ausgeben();
        a.erweitern();
        a.alsKommazahl();


    }
}
