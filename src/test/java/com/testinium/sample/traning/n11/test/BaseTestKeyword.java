package com.testinium.sample.traning.n11.test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class BaseTestKeyword extends BaseTest{

    public void girisYap(String kullaniciAdi, String sifre){
        clickByLintext("Giriş Yap");
        sendById("email", kullaniciAdi);
        sendById("password", sifre);
        clickById("loginButton");
    }

    //@Step("<keyword> ürününü ara")
    // "Samsung" ürününü ara
    public void urunAra(String keyword){
        callHomePage();

        sendById("searchData", keyword);
        clickByXpath("//*[@title='ARA']");
    }

    //@Step("Sisteme kayit ol ad: <ad> soyad: <soyad>")
    public void kayitOl(String ad, String soyad, String email, String sifre, String sifreTekrar, String telefon, String dogumGun, String dogumAy, String dogumYil){
        clickByXpath("//*[@title='Üye Ol']");
        clickByXpath("//*[text()='Tamam']");
        sendById("firstName", ad);
        sendById("lastName", soyad);
        sendById("registrationEmail", email);
        sendById("registrationPassword", sifre);
        sendById("passwordAgain", sifreTekrar);
        sendById("phoneNumber", telefon);
        clickByXpath("//*[@for = 'genderMale']");
        new Select(driver.findElement(By.id("birthDay"))).selectByValue(dogumGun);
        new Select(driver.findElement(By.id("birthMonth"))).selectByValue(dogumAy);
    }


}
