package com.testinium.sample.traning.n11.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;

public class N11GirisTest extends BaseTestKeyword{


    @Test
    public void girisTest(){
        girisYap("melih.sakarya@gmail.com", "123456");
        urunAra("Samsung");
        urunAra("iphone");
        girisYap("ahmet.dursun@gmail.com", "12312312");



    }


    @Test
    public void uyelikTest(){

        kayitOl("Melih", "Sakarya", "melihasd@gmail.com", "123456","123456", "533444444", "16", "9", "1981");
        girisYap("melih.sakarya@gmail.com", "123456");
        urunAra("Samsung");
    }


}
