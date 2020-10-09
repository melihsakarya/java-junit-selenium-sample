package com.testinium.sample.traning.flypgs.test;

import org.junit.Test;
import org.openqa.selenium.By;

public class PegasusTest extends BaseTest{

    @Test
    public void ornekTest(){
        //driver.findElement(By.id())
        //clickById("one_way");
        driver.findElement(By.xpath("//*[@for='one_way']")).click();
    }
}
