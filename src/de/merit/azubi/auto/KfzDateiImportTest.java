package de.merit.azubi.auto;

import org.junit.Test;

import java.io.IOException;
import java.text.ParseException;
import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class KfzDateiImportTest {


    @Test
    public void countInputLinesTest() throws IOException {

        KfzDateiImport dateiImport = new KfzDateiImport("MeRITAutos.csv");
        assertNotNull(dateiImport);
        assertEquals(5, dateiImport.getAnzahlZeilen());
    }

}
