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

    @Test
    public void gittigidiyorLoginTest(){
        //clickByDataCy("header-user-menu");
        driver.findElement(By.xpath("//*[@title = 'Giriş Yap']")).click();
        driver.get("https://www.gittigidiyor.com/uye-girisi");


        sendById("L-UserNameField", "melih.sakarya@gmail.com");
        sendById("L-PasswordField", "123456");
        clickById("gg-login-enter");

    }




}
