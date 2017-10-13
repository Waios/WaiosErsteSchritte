package de.merit.azubi;

public class EinfacheIfElseAnweisung {


    public static void main(String[] args) {

        int hans = 63;
        int fritz = 78;

        if (hans > fritz) {
            System.out.println("Hans (" + hans + " Jahre) ist älter als Fritz (" + fritz + " Jahre)");

        } else {
            System.out.println("Fritz (78) ist älter als Hans");

            int erg = hans + fritz;

            System.out.println("Zusammen sind sie  "+erg+ " Jahre alt");
        }
    }
}
