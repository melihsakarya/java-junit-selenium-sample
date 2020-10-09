package com.testinium.sample.traning.gg.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class YeniTest extends BaseTest{

    @Test
    public void basarisizLoginTest(){

        callPage("https://www.gittigidiyor.com/uye-girisi");

        sendById("L-UserNameField", "melih.sakarya@gmail.com");
        sendById("L-PasswordField", "123456");
        clickById("gg-login-enter");

        List<WebElement> kontrol = driver.findElements(By.xpath("//span[text()='Lütfen bilgilerinizi kontrol ediniz.']"));
        if(kontrol.size() == 0){
            fail("şifre hatali değil");
        }

        assertTrue(driver.getPageSource().contains("Lütfen bilgilerinizi kontrol ediniz."));

        Assert.assertEquals("Üye Girişi - GittiGidiyor", driver.getTitle());
        Assert.assertEquals("Üye Girişi", driver.getTitle());
        Assert.assertNotNull(driver.getTitle());


    }



}
