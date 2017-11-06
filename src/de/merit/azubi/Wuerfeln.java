package de.merit.azubi;

public class Wuerfeln {

    public static void main(String[] args) {


        int i = 0;
        double zufallszahl;
        int gewuerfelt = 0;

        while (gewuerfelt != 6) {


            zufallszahl = (Math.random());

            System.out.println(zufallszahl);

            gewuerfelt = (int) (zufallszahl * 6) + 1;

            System.out.println(gewuerfelt);

            i++;
        }

        System.out.println("Du hast: " + i + " Versuche gebraucht um eine 6 zu würfeln");
    }
}
