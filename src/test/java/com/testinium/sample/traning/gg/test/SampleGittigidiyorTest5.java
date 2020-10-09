package com.testinium.sample.traning.gg.test;

import org.junit.Test;
import org.openqa.selenium.By;

public class SampleGittigidiyorTest5 extends BaseTest {


    @Test
    public void sampleTest(){
        sendByDataCy("header-search-input", "Samsung");
        sendByDataCy("header-search-input", "iphone");
        sendByDataCy("header-search-input", "macbook");
        clickByDataCy("search-find-button");
    }





}
