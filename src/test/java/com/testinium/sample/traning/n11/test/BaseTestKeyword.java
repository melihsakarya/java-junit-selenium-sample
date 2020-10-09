package com.testinium.sample.traning.n11.test;

public class BaseTestKeyword extends BaseTest{

    public void girisYap(String kullaniciAdi, String sifre){
        clickByLintext("Giriş Yap");
        sendById("email", kullaniciAdi);
        sendById("password", sifre);
        clickById("loginButton");
    }

    public void urunAra(String keyword){
        callHomePage();

        sendById("searchData", keyword);
        clickByXpath("//*[@title='ARA']");
    }
}
