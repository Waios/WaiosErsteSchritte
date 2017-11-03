package de.merit.azubi;

public class Bruch {

    int erweitert, zaehler, nenner;
    double kommazahl;

    void ausgeben(){
        System.out.println("Der Zähler ist: " + zaehler + " Der Nenner ist: " + nenner);

    }

    void erweitern(){
        zaehler = zaehler * erweitert;
        nenner = nenner * erweitert;
        System.out.println("Erweiterte Zahl ist: " + zaehler + " Erweiterter Nenner ist:  " + nenner);

    }

    void alsKommazahl(){
        kommazahl = ((double) zaehler) / nenner;

        System.out.println("Als Kommazahl: " + kommazahl);

    }
}
