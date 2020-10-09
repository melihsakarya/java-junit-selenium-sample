package com.testinium.sample.traning.gg.test;

import org.junit.Test;
import org.openqa.selenium.By;

public class NewTest extends BaseTest{

    @Test
    public void sampleTest(){
        driver.findElement(By.xpath("//*[//a]")).click();
    }
}
