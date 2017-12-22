package de.merit.azubi.sortlines;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {


    public static void main(String[] args) throws IOException {

        System.out.println("Bitte Dateinamen eingeben: ");

        Scanner scanner = new Scanner(System.in);
        String dateiName = scanner.nextLine();

        System.out.println("Bitte Name der Ausgabedatei: ");
        String ausgabeDateiName = scanner.nextLine();



        SortLines theSorter = new SortLines();


        ArrayList<String> zeilenListe = theSorter.ladeDatei(dateiName);
        ArrayList<String> sortierteListe = theSorter.sortZeilen(zeilenListe);
        theSorter.writeToFile(sortierteListe, ausgabeDateiName);


    }
}
