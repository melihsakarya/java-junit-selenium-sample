package com.testinium.sample.traning.gg.test;

import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;

public class OrnekHata extends BaseTest{

    @Test
    public void ornekTest(){
        sendByDataCy("header-search-input", "Samsung");

        try{
            clickById("search-find-button");
            System.out.println("Id ile calisti");
        }
        catch (NoSuchElementException e){
            System.out.println("hata oldu data-cy ile calisacak");
            clickByDataCy("search-find-button");
        }
        catch (Exception e){
            System.out.println("Bilinmeyen bir hata olustu");

        }



    }
}
