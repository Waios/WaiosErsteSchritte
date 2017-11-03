package de.merit.azubi;

public class Bruchrechnen_1 {

    public static void main(String[] args) {

        Bruch a = new Bruch();

        a.zaehler = 6;
        a.nenner = 10;
        a.erweitert = 8;

        a.ausgeben();
        a.erweitern();
        a.alsKommazahl();
    }
}
