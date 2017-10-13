package de.merit.azubi;

public class AufgabeForschleife {
    // eine for schleife die die Summer aller durch 7 teilbaren Zahlen zwischen 0 und 100 ausgibt

    public static void main(String[] args) {

        for (int i = 0; i<=100; i++){


            // % das ist der Modulo Operator
            if (i % 7 == 0) {
                System.out.println("Die Zahl: " + i + " ist durch 7 teilbar.");
            }

        }

    }
}



