package de.merit.azubi;

public class ForEach {

    public static void main(String[] args) {

        int[] array = {4, 8, 4, 2, 2, 2, 1, 1, 5, 9};

        for (int elem : array) {
            System.out.println(elem);

            String[]  arr = {"Heino", "Dieter", "Sarah", "Otto"};

            for(String pers : arr)
                System.out.println(pers);
        }
    }
}
