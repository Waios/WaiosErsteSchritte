package de.merit.azubi;

public class EinfacheSchleife {
    public static void main(String[] args) {
        int summe = 0;


        for (int i= 0; i <=100; i++){
            summe = summe + i;

            System.out.println(i);
        }

        System.out.println("Endsumme:"+ summe);
    }
}
