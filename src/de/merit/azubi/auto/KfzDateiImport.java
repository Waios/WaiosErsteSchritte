package de.merit.azubi.auto;

import com.Ostermiller.util.CSVParser;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class KfzDateiImport {

    private ArrayList<String[]> allLines;
    private int anzahlZeilen;

    public KfzDateiImport(String fileName) throws IOException {


       allLines = readLines(fileName);
    }


    public int getAnzahlZeilen() {
        return allLines.size();
    }

    private ArrayList<String[]> readLines(String csvFile) throws IOException {


        ArrayList<String[]> lines = new ArrayList<String[]>();


        CSVParser csvParser = new CSVParser(new FileInputStream(csvFile));

        for (String[] l; (l = csvParser.getLine()) != null; ) {

           lines.add(l);
    }

        return lines;
    }
}
