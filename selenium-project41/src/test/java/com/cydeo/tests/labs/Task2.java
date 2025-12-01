package com.cydeo.tests.labs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Task2 {
    @Test
    public void test1() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://practice.cydeo.com/");
        String actualText = driver.findElement(By.xpath("//h1")).getText();

        Assert.assertEquals(actualText,"Test Automation Practice");
        clickLink(driver, "A/B Testing");
        Assert.assertEquals(driver.getCurrentUrl(),"https://practice.cydeo.com/abtest");
        driver.quit();



    }

    public void clickLink (WebDriver driver, String textOfTheLink){

        String locator = "//a[.='"+textOfTheLink+"']";
        driver.findElement(By.xpath(locator)).click();


    }
}
