package de.merit.azubi;


import java.util.Arrays;


public class SortierenMethode {

    public static void main(String[] args) {
        String[] s = new String [7];
        s [0] = "Paul";
        s [1] = "Willi";
        s [2] = "Anton";
        s [3] = "Karl";
        s [4] = "Sepp";
        s [5] = "Petra";
        s [6] = "Peter";

        Arrays.sort (s);
        for (int position = 0; position < s. length; position++) {
            System.out.println(s[position]);
        }
    }



}
