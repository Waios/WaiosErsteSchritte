package de.merit.azubi;

public class WdhZinsen {

    public static void main(String[] args) {

        double summe = 0;
        int monatlicheZahlung = 200;
        int geschenk = 100;
        double[] zinssatz = {1.03, 1.032, 1.035, 1.038, 1.04};


        for (int jahr = 0; jahr < 5; jahr++) {


            for (int monat = 1; monat <= 12; monat++) {

                if (monat == 10) {
                    summe = summe + monatlicheZahlung + geschenk;

                    System.out.println("Einzahlung monatlich: " + monatlicheZahlung + " Geschenk: " + geschenk + " Gesamter Betrag " + summe);

                } else {


                    summe = summe + monatlicheZahlung;
                    summe = Math.round(100.0 * summe) / 100.0;


                    System.out.println("Einzahlung monatlich: " + monatlicheZahlung + " " + "Gesamter Betrag: " + summe);

                }
            }
            summe = summe * zinssatz[jahr];
            summe = Math.round(100.0 * summe) / 100.0;

            System.out.println("Einzahlung jährlich zuzüglich Zinsen:  " + (jahr + 1) + " Jahre  " + summe + " € ");

        }
    }
}
