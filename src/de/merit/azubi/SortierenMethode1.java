package de.merit.azubi;

import java.util.Arrays;

public class SortierenMethode1 {

    public static void main(String[] args) {

        String[] [] teams = {
                {"Steffen", "Andreas", "Tobias", "Anna", "Tom"},
                {"Thomas", "Michael", "Xaver", "Christiane", "Reza", "Waios"},
                {"Gregor", "Anne", "Robbi", "Kalle", "Paul"},
                {"Waios", "Emily"}

        };

        for (int zeile = 0; zeile < teams.length; zeile++) {
            System.out.println("\n team" + zeile);

            Arrays.sort (teams[zeile]);

            for (int position = 0; position < teams [zeile].length; position++) {

                System.out.println(teams[zeile] [position]);


            }
        }


    }
}
