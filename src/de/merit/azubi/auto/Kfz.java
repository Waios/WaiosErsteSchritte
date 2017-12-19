package de.merit.azubi.auto;

import java.util.Date;

public class Kfz {

    Date bauJahr;
    Date naechsterTuev;
    Integer kilometerstand;
    String kennzeichen;
    String marke;
    String besitzer;

    public Kfz(Date bauJahr, String kennzeichen, String marke, String besitzer) {

        this.bauJahr = bauJahr;
        this.kennzeichen = kennzeichen;
        this.marke = marke;
        this.besitzer = besitzer;


    }

}
