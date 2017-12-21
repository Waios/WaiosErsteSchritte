package de.merit.azubi.auto;

import org.junit.Test;

import java.text.ParseException;
import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class KfzTest {


    private final LocalDate baujahr = LocalDate.of(2010,1,1);

    @Test
    public void initTest() {
        Kfz emilysAuto = new Kfz(LocalDate.now() , "DA-RR 1024", "Suzuki");
        assertEquals("Emily", emilysAuto.getBesitzer());

        Kfz einAuto = new Kfz(LocalDate.now() , "DA-RR 1024", "Suzuki", "MeRIT");

        assertNotNull(einAuto);

        Kfz nochEinAuto = new Kfz(LocalDate.now() , "DA-RR 2048", "VW", "MeRIT");
        assertNotNull(nochEinAuto);

        System.out.println(einAuto);
        System.out.println(nochEinAuto);
    }

    @Test
    public void initWithDateTest() throws ParseException {


        Kfz einAuto = new Kfz(baujahr, "DA-RR 1024", "Suzuki", "Waios");
       assertEquals(2010, einAuto.getBaujahr());
       System.out.println(einAuto);

        assertEquals("Suzuki", einAuto.getMarke());
        assertEquals("Waios", einAuto.getBesitzer());
        assertEquals("DA-RR 1024", einAuto.getKennzeichen());

    }

    @Test
    public void evalKmTest() throws ParseException {


        Kfz einAuto = new Kfz(baujahr, "DA-RR 1024", "Suzuki", "Waios");
        assertEquals(new Integer(0), einAuto.getKm());

        einAuto.setKm(99000);
        assertEquals(new Integer(99000), einAuto.getKm());


    }

    @Test
    public void evalZulassungTest() throws ParseException {


        Kfz einAuto = new Kfz(baujahr, "DA-RR 1024", "Suzuki", "Waios");
        //einAuto.setZulassung("20100606");
        einAuto.setZulassung(2010, 07, 06);
        assertEquals("20100706", einAuto.getZulassung());



    }

    @Test
    public void evalTuevTest() throws ParseException {



        Kfz einAuto = new Kfz(baujahr, "DA-RR 1024", "Suzuki", "Waios");
        einAuto.setTuev(2015, 04);
        assertEquals("201504", einAuto.getTuev());



    }

    @Test
    public void zulassungInitTest() throws ParseException {



        Kfz einAuto = new Kfz(baujahr, "DA-RR 1024", "Suzuki", "Waios");

        einAuto.setZulassung(2010, 07, 06);
        assertEquals("20100706", einAuto.getZulassung());

        einAuto.setZulassung(2010, 10, 05);
        assertEquals("20100706", einAuto.getZulassung());

        }

    @Test
    public void zulassungTuevTest() throws ParseException {


        Kfz einAuto = new Kfz(baujahr, "DA-RR 1024", "Suzuki", "Waios");

        einAuto.setZulassung(2010, 07, 06);
        assertEquals("20100706", einAuto.getZulassung());


        assertEquals("201507", einAuto.getTuev());

    }


    @Test
    public void farbenTest() throws ParseException {


        Kfz einAuto = new Kfz(baujahr, "DA-RR 1024", "Suzuki", "Waios");

        einAuto.setFarbe("schwarz");
        assertEquals("schwarz", einAuto.getfarbe());




    }

    @Test
    public void kiloWattTest() throws ParseException {


        Kfz einAuto = new Kfz(baujahr, "DA-RR 1024", "Suzuki", "Waios");

        einAuto.setkiloWatt(90);
        assertEquals(90 , einAuto.getkiloWatt());




    }


}
