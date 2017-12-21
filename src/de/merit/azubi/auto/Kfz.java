package de.merit.azubi.auto;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kfz {

    private LocalDate bauJahr;
    private LocalDate naechsterTuev;
    private Integer kilometerstand = 0;
    private String kennzeichen;
    private String marke;
    private String besitzer;
    private LocalDate zulassung = null;
    private String farbe;
    private int kiloWatt;


    public Kfz(LocalDate bauJahr, String kennzeichen, String marke, String besitzer) {

        this.bauJahr = bauJahr;
        this.kennzeichen = kennzeichen;
        this.marke = marke;
        this.besitzer = besitzer;
    }

    public Kfz(LocalDate bauJahr, String kennzeichen, String marke) {
        this(bauJahr,kennzeichen,marke,"Emily");
    }

    public int getBaujahr() {
        return bauJahr.getYear();
    }

    public String getMarke() {
        return marke;
    }

    public String getBesitzer() {
        return besitzer;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public Integer getKm() {
        return kilometerstand;
    }

    public void setKm(int km) {
        this.kilometerstand = km;
    }

    public void setTuev(int jahr, int monat) {
        LocalDate calendar = LocalDate.of(jahr,monat, 1);
        this.naechsterTuev = calendar;
    }

    public String getTuev() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMM");
        return naechsterTuev.format(formatter);

    }

    public void setZulassung(int jahr, int monat, int tag) {
        LocalDate calendar = LocalDate.of(jahr,monat,tag);//Calenadar ist 0 basiert.
        if (zulassung == null) {
            this.zulassung = calendar;
            setTuev(jahr+5, monat);
        }else {
            System.out.println("Warnung, Zulassung ist schon gesetzt!" + getZulassung());
        }
    }

    public String getZulassung() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        return zulassung.format(formatter);

    }

    public String getfarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public int getkiloWatt() {
        return kiloWatt;
    }

    public void setkiloWatt(int kiloWatt) {
        this.kiloWatt = kiloWatt;
    }
}
