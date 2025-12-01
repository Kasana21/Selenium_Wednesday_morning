package com.cydeo.tests.labs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task1 {
    //comnad+n short cut for @test

    @Test
    public void test1() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://practice.cydeo.com/");
        
        String title = driver.getTitle();//.var short cut is or assigning
        String currentUrl = driver.getCurrentUrl();

        Assert.assertEquals(title, "Practice");
        Assert.assertTrue(currentUrl.contains("https://practice.cydeo.com/"));



        driver.quit();



    }
}
