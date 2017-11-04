package de.merit.azubi;

public class Getraenkehandel {

    public static void main(String[] args) {

        double preis = 7.99;
        int anzahlWasserkiste = 17;
        double einkauf;

        if ((anzahlWasserkiste * preis) >= 100) {
            einkauf = anzahlWasserkiste * preis * 0.95;
            System.out.println("Das macht dann " + einkauf + " € abzüglich 5% Rabatt bitte");


        }else
        if ((anzahlWasserkiste * preis) >= 70) {
            einkauf = anzahlWasserkiste * preis * 0.97;
            System.out.println("Das macht dann " + einkauf + "  € abzüglich 3% Rabatt bitte");

        }else
        if ((anzahlWasserkiste * preis) >= 50) {

            einkauf = anzahlWasserkiste * preis;
            System.out.println(einkauf);

            einkauf = anzahlWasserkiste * preis * 0.99;
            System.out.println("Das macht dann " + einkauf + " € abzüglich 1% Rabatt bitte");
            System.out.println(einkauf);

        }else  {
            einkauf = anzahlWasserkiste*preis;
            System.out.println("Das macht dann " + einkauf + " € bitte");

        }
    }
}
