package com.cydeo.tests.week01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Etsy_Test {
    /*
    go to url https://www.etsy.com/
    locate Help Center Link anc click
    verify that url contains "help"
     */
    public static void main(String[] args) {
        WebDriverManager .chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.etsy.com/");

      //for link we have linkText or partialLinkText we can use directly
        WebElement helpLink = driver.findElement(By.partialLinkText("Help Center"));

        helpLink.click();
        if (driver.getCurrentUrl().contains("help")){
            System.out.println("PASSED");
        }
    }
}
