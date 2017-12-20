package de.merit.azubi.auto;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Kfz {

    private Calendar bauJahr;
    private Calendar naechsterTuev;
    private Integer kilometerstand = 0;
    private String kennzeichen;
    private String marke;
    private String besitzer;
    private Calendar zulassung = null;
    private String farbe;


    public Kfz(Calendar bauJahr, String kennzeichen, String marke, String besitzer) {

        this.bauJahr = bauJahr;
        this.kennzeichen = kennzeichen;
        this.marke = marke;
        this.besitzer = besitzer;


    }

    public Kfz(Calendar bauJahr, String kennzeichen, String marke) {
        this(bauJahr,kennzeichen,marke,"Emily");
    }

    public int getBaujahr() {
        return bauJahr.get(Calendar.YEAR);
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
        Calendar calendar = new GregorianCalendar(jahr,monat-1, 1);
        this.naechsterTuev = calendar;
    }

    public String getTuev() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
        return sdf.format(naechsterTuev.getTime());

    }

    public void setZulassung(int jahr, int monat, int tag) {
        Calendar calendar = new GregorianCalendar(jahr,monat-1,tag);//Calenadar ist 0 basiert.
        if (zulassung == null) {
            this.zulassung = calendar;
            setTuev(jahr+5, monat);
        }else {
            System.out.println("Warnung, Zulassung ist schon gesetzt!" + getZulassung());
        }
    }

    public String getZulassung() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        return sdf.format(zulassung.getTime());

    }

    public String getfarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }
}
