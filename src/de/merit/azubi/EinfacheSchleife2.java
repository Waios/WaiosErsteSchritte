package de.merit.azubi;

public class EinfacheSchleife2 {
    public static void main(String[] args) {
        double zufallszahl= 0;
        int zz = 0;
        double summeGezogen = 0;
        int i= 0;
        for (i= 0; i <10000; i++){
            zufallszahl = (Math.random());

            //System.out.println(zufallszahl);

            zz = (int) (zufallszahl * 10) + 1;
            summeGezogen = summeGezogen + zz;

            System.out.println("gezogen:"+zz);

        }
        System.out.println("wert i: "+i);
        System.out.println("summeGezogen "+ summeGezogen);
        System.out.println("durschnittswert "+ summeGezogen / i);
    }
}
