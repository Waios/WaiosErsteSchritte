package de.merit.azubi;



public class SortierenTeams {

    public static void main(String[] args) {

        String [] [] teams = {
                {"Steffen", "Andreas", "Tobias", "Anna", "Tom"},
                {"Thomas", "Michael", "Xaver", "Christiane", "Reza", "Waios"},
                {"Gregor", "Anne", "Robbi", "Kalle", "Paul"},
                {"Waios", "Emily"}
        };

        for (String[] dim1 : teams) {
            for (String member : dim1) {
                System.out.println("Member: " + member);

            }

        }

        String [][] team = new String [3] [5];

        team[0][0] = "Steffen";
        team[0][1] = "Andreas";
        team[0][2] = "Tobias";
        team[0][3] = "Anna";
        team[0][4] = "Tom";

        team[1][0] = "Thomas";
        team[1][1] = "Michael";
        team[1][2] = "Christiane";
        team[1][3] = "Reza";
        team[1][4] = "Waios";

        team[2][0] = "Gregor";
        team[2][1] = "Anne";
        team[2][2] = "Robbi";
        team[2][3] = "Kalle";
        team[2][4] = "Paul";

        for (int zeile = 0; zeile < 4; zeile++) {
            System.out.println("}\nTeam " + zeile);

            for (int zaehler = 0; zaehler < teams[zeile].length; zaehler++);{

                for (int position = 1; position < (teams[zeile].length - zaehler); position++) {
                    if ((teams[zeile][position]).compareTo(teams[zeile][position - 1]) < 0) {
                        String temp = teams[zeile][position - 1];
                        teams[zeile][position - 1] = teams[zeile][position];
                        teams[zeile][position] = temp;
                    }

                }
            }
         for (int x = 0; x < teams[zeile].length; x++) {
             System.out.println(teams[zeile][x]);
         }

        }
    }
}
