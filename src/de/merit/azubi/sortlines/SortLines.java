package de.merit.azubi.sortlines;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class SortLines {


    public ArrayList<String> ladeDatei(String datName) throws IOException {

        File file = new File(datName);

        if (!file.canRead() || !file.isFile()) {
            System.exit(0);
        }

        BufferedReader inBuffer = new BufferedReader(new FileReader(datName));

        String zeile = null;
        ArrayList<String> eingeleseneZeilen = new ArrayList<>();
        while ((zeile = inBuffer.readLine()) != null) {
            //System.out.println("Gelesene Zeile: " + zeile);
            eingeleseneZeilen.add(zeile);
        }

        return eingeleseneZeilen;

    }

    public ArrayList<String> sortZeilen(ArrayList<String> eingelZeilen)  {

        eingelZeilen.sort(Comparator.comparing(String::length));

        return eingelZeilen;

    }

    public void writeToFile(ArrayList<String> aList, String ausgabeDateiName) throws IOException {

        FileWriter writer = new FileWriter(ausgabeDateiName);
        for(String str: aList) {
            writer.write(str);
            writer.write("\n");

        }
        writer.close();

    }




}