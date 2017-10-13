package de.merit.azubi;

public class Kredit_1 {

    public static void main(String[] args) {

        int[] monatlicheZahlung = {200, 225, 250, 275, 300};
        final double ZINSSATZ = 0.05;
        double kredit = 20000;
        int bearbeitungsgebuehr = 10;

        for (int jahr = 0; jahr < 5; jahr++) {

            double zahlen = 0;

            for (int monat = 0; monat < 12; monat++) {

                zahlen = zahlen + monatlicheZahlung[jahr];

            }

            kredit = (kredit +  kredit * ZINSSATZ) - zahlen;
        }

        kredit = kredit + bearbeitungsgebuehr * 5;

        System.out.println(Math.round(kredit * 100.0) / 100.0);
    }
}
