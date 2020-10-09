package com.testinium.sample.traning.gg.test;

import org.junit.Test;
import org.openqa.selenium.By;

public class SampleGittigidiyorTest4 extends BaseTest {


    @Test
    public void sampleTest(){

        sendByDataCy("header-search-input", "Samsung");
        sendByDataCy("header-search-input", "iphone");
        sendByDataCy("header-search-input", "macbook");
        clickByDataCy("search-find-button");
    }

    public void sendByDataCy(String dataCy, String value){
        driver.findElement(By.xpath("//*[@data-cy='"+dataCy+"']")).clear();
        driver.findElement(By.xpath("//*[@data-cy='"+dataCy+"']")).sendKeys(value);
    }

    public void clickByDataCy(String dataCy){
        driver.findElement(By.xpath("//*[@data-cy='"+dataCy+"']")).click();
    }

    @Test
    public void sampleSepetTest(){
        driver.findElement(By.xpath("//*[text()='Sepet']")).click();

    }



}
