package com.testinium.sample.traning.gg.test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    WebDriver driver;

    @Before
    public void startTest(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.gittigidiyor.com");
    }

    @After
    public void endTest(){
        driver.quit();
    }

    public void sendByDataCy(String dataCy, String value){
        driver.findElement(By.xpath("//*[@data-cy='"+dataCy+"']")).clear();
        driver.findElement(By.xpath("//*[@data-cy='"+dataCy+"']")).sendKeys(value);
    }

    public void clickByDataCy(String dataCy){
        driver.findElement(By.xpath("//*[@data-cy='"+dataCy+"']")).click();
    }

}
