package de.merit.azubi;

public class Kredit {

    public static void main(String[] args) {

        int[] monatlicheZahlung = {200, 225, 250, 275, 300};
        final double ZINSSATZ = 0.05;
        double kredit = 20000;
        double zinsen;
        double abzahlen;
        int sonderzahlung = 300;


        for (int jahr = 0; jahr < 5; jahr++) {

            double zahlen = 0;

            for (int monat = 0; monat < 12; monat++) {

                if (monat == 1) {


                    zahlen = zahlen + monatlicheZahlung[jahr] + sonderzahlung;
                    System.out.println(zahlen);


                } else {
                    zahlen = zahlen + monatlicheZahlung[jahr];
                    System.out.println(zahlen);
                }
            }

                zinsen = kredit * ZINSSATZ;
                System.out.println("gezahlte Zinsen:  " + zinsen);

                abzahlen = zahlen - zinsen;
                System.out.println("Abgezahlt:  " + abzahlen);

                kredit = kredit - abzahlen;
                System.out.println("Ihre Schuĺden belaufen sich nach " + (jahr + 1) + " Jahr auf:  " + kredit);
            }


            kredit = Math.round(kredit * 100.0) / 100.0;

            System.out.println("Ihre Schulden belaufen sich noch auf: " + kredit);

        }
    }

