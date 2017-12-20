package de.merit.azubi.auto;

import org.junit.Test;

import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class KfzTest {


    @Test
    public void initTest() {
        Kfz emilysAuto = new Kfz(new GregorianCalendar() , "DA-RR 1024", "Suzuki");
        assertEquals("Emily", emilysAuto.getBesitzer());

        Kfz einAuto = new Kfz(new GregorianCalendar() , "DA-RR 1024", "Suzuki", "MeRIT");

        assertNotNull(einAuto);

        Kfz nochEinAuto = new Kfz(new GregorianCalendar() , "DA-RR 2048", "VW", "MeRIT");
        assertNotNull(nochEinAuto);

        System.out.println(einAuto);
        System.out.println(nochEinAuto);
    }

    @Test
    public void initWithDateTest() throws ParseException {


        Calendar jahr = new GregorianCalendar(2010,1,1,0,0,0);



        Kfz einAuto = new Kfz(jahr, "DA-RR 1024", "Suzuki", "Waios");
       assertEquals(2010, einAuto.getBaujahr());
       System.out.println(einAuto);

        assertEquals("Suzuki", einAuto.getMarke());
        assertEquals("Waios", einAuto.getBesitzer());
        assertEquals("DA-RR 1024", einAuto.getKennzeichen());

    }

    @Test
    public void evalKmTest() throws ParseException {


        Calendar jahr = new GregorianCalendar(2010,1,1,0,0,0);

        Kfz einAuto = new Kfz(jahr, "DA-RR 1024", "Suzuki", "Waios");
        assertEquals(new Integer(0), einAuto.getKm());

        einAuto.setKm(99000);
        assertEquals(new Integer(99000), einAuto.getKm());


    }
    @Test
    public void evalZulassungTest() throws ParseException {


        Calendar jahr = new GregorianCalendar(2010,1,1,0,0,0);

        Kfz einAuto = new Kfz(jahr, "DA-RR 1024", "Suzuki", "Waios");
        //einAuto.setZulassung("20100606");
        einAuto.setZulassung(2010, 07, 06);
        assertEquals("20100706", einAuto.getZulassung());



    }

    @Test
    public void evalTuevTest() throws ParseException {


        Calendar jahr = new GregorianCalendar(2010,1,1,0,0,0);

        Kfz einAuto = new Kfz(jahr, "DA-RR 1024", "Suzuki", "Waios");
        einAuto.setTuev(2015, 04);
        assertEquals("201504", einAuto.getTuev());



    }
    @Test
    public void zulassungInitTest() throws ParseException {


        Calendar jahr = new GregorianCalendar(2010,1,1,0,0,0);

        Kfz einAuto = new Kfz(jahr, "DA-RR 1024", "Suzuki", "Waios");

        einAuto.setZulassung(2010, 07, 06);
        assertEquals("20100706", einAuto.getZulassung());

        einAuto.setZulassung(2010, 10, 05);
        assertEquals("20100706", einAuto.getZulassung());

        }

    @Test
    public void zulassungTuevTest() throws ParseException {


        Calendar jahr = new GregorianCalendar(2010,1,1,0,0,0);

        Kfz einAuto = new Kfz(jahr, "DA-RR 1024", "Suzuki", "Waios");

        einAuto.setZulassung(2010, 07, 06);
        assertEquals("20100706", einAuto.getZulassung());


        assertEquals("201507", einAuto.getTuev());

    }


    @Test
    public void farbenTest() throws ParseException {


        Calendar jahr = new GregorianCalendar(2010,1,1,0,0,0);

        Kfz einAuto = new Kfz(jahr, "DA-RR 1024", "Suzuki", "Waios");

        einAuto.setFarbe("schwarz");
        assertEquals("schwarz", einAuto.getfarbe());




    }


}
