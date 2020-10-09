package com.testinium.sample.traning.gg.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleGittigidiyorTest2 {

    WebDriver driver;

    @Before
    public void startTest(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.gittigidiyor.com");
    }

    @Test
    public void sampleTest(){
        driver.findElement(By.xpath("//*[@data-cy='header-search-input']")).sendKeys("samsung");
        driver.findElement(By.xpath("//*[@data-cy='search-find-button']")).click();

    }

    @Test
    public void sampleSepetTest(){
        driver.findElement(By.xpath("//*[text()='Sepet']")).click();
    }


    @After
    public void endTest(){
        driver.quit();
    }
}
