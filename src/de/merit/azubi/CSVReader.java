package de.merit.azubi;

import com.Ostermiller.util.CSVParser;

import java.io.*;

public class CSVReader {

    public static void main(String[] args) throws IOException {

        String csvFile = "MeRITAutos.csv";

        CSVParser gugu = new CSVParser(new FileInputStream(csvFile));

        for (String[] line; (line = gugu.getLine()) != null; ) {

            System.out.println(gugu.lastLineNumber() + " " + line[2] );
        }
    }
}