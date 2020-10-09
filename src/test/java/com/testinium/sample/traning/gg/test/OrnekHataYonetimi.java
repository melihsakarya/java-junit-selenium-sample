package com.testinium.sample.traning.gg.test;

import org.junit.Test;

public class OrnekHataYonetimi {

    @Test
    public void ornekTest(){
        Ogrenci ogr = new Ogrenci();

        System.out.println(ogr.ad);
        ogr.ad.length();

        ogr.fotograf.length();

    }
}
