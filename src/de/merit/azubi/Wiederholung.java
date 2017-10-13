package de.merit.azubi;

public class Wiederholung {

    public static void main(String[] args) {

        double ergebniss = 0;
        int monatsgehalt = 200;
        int geschenk = 0;
        double[] zinssatz = {1.03, 1.032, 1.035, 1.038, 1.04};


        for (int jahr = 0; jahr < 5; jahr++) {


            for (int monat = 1; monat <= 12; monat++) {

                if (monat == 10) {
                    ergebniss = ergebniss + monatsgehalt + geschenk;

                    System.out.println("Monatliches Gehalt: " + monatsgehalt + " Geschenk: " + geschenk + " Gesamter Betrag " + ergebniss);

                } else {


                    ergebniss = ergebniss + monatsgehalt;
                    ergebniss = Math.round(100.0 * ergebniss) / 100.0;


                    System.out.println("Monatliches Gehalt: " + monatsgehalt + " " + "Gesamter Betrag: " + ergebniss);

                }

            }
            ergebniss = ergebniss * zinssatz[jahr];
            ergebniss = Math.round(100.0 * ergebniss) / 100.0;

            System.out.println("Gehalt jährlich zuzüglich Zinsen:  " + (jahr + 1) + " Jahre  " + ergebniss + " € ");


        }
    }
}