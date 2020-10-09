package com.testinium.sample.traning.gg.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleGittigidiyorTest {


    @Test
    public void sampleTest(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.gittigidiyor.com");

        driver.findElement(By.xpath("//*[@data-cy='header-search-input']")).sendKeys("samsung");
        driver.findElement(By.xpath("//*[@data-cy='search-find-button']")).click();

        driver.quit();
    }

    @Test
    public void sampleSepetTest(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.gittigidiyor.com");

        driver.findElement(By.xpath("//*[text()='Sepet']")).click();

        driver.quit();
    }
}
