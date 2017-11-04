package de.merit.azubi;

public class EinmalEins {

    public static void main(String[] args) {

        int erg = 0;

        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 10; j++) {


                for (int k = 1; k <= 10; k++) {
                    erg = i * j * k;

                    System.out.println(i + "*" + j + "*" + k + "="  + erg);

                }
            }
        }
    }
}
