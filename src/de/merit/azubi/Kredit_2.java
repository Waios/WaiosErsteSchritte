package de.merit.azubi;

public class Kredit_2 {

    public static void main(String[] args) {

        int[] monatlicheZahlung = {200, 225, 250, 275, 300};
        final double ZINSSATZ = 0.05;
        double kredit = 20000;

        for (int jahr = 0; jahr < 5; jahr++) {

            double zahlen = 12 * monatlicheZahlung[jahr];

            kredit = (kredit + kredit * ZINSSATZ) - zahlen;

        }

        System.out.println(Math.round (kredit * 100.0) / 100.0);
    }
}
