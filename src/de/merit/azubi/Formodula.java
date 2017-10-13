package de.merit.azubi;

public class Formodula {
    public static void main(String[] args) {
        for (int i = 0; i<100; i++){

            //wenn ergebnis von modula 2 = 0 dann ist die zahl grade
            if (i % 2 == 0 ) {
                System.out.println("Die Zahl: " + i + " ist gerade.");
            }
            if (i % 2 == 1){
                System.out.println("Die Zahl: " + i + " ist ungerade.");
            }

            if (i % 5 == 0 ) {
                System.out.println("Die Zahl: " + i + " ist durch 5 teilbar.");
            }

        }
    }
}
