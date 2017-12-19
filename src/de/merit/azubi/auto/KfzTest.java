package de.merit.azubi.auto;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertNotNull;

public class KfzTest {


    @Test
    public void initTest(){
        Kfz einAuto = new Kfz(new Date(),"DA-RR 1024", "Suzuki", "MeRIT");

        assertNotNull(einAuto);

        Kfz nochEinAuto = new Kfz(new Date(),"DA-RR 2048", "VW", "MeRIT");
        assertNotNull(nochEinAuto);

        System.out.println(einAuto);
        System.out.println(nochEinAuto);
    }
}
