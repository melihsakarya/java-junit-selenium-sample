package com.testinium.sample.traning.gg.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleGittigidiyorTest3 extends BaseTest {


    @Test
    public void sampleTest(){
        driver.findElement(By.xpath("//*[@data-cy='header-search-input']")).sendKeys("samsung");
        driver.findElement(By.xpath("//*[@data-cy='search-find-button']")).click();
    }

    @Test
    public void sampleSepetTest(){
        driver.findElement(By.xpath("//*[text()='Sepet']")).click();
    }



}
