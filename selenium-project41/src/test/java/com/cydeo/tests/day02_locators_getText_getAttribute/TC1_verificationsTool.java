package com.cydeo.tests.day02_locators_getText_getAttribute;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1_verificationsTool {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        //1. Open Chrome browser
        //2. Go to https://practice.cydeo.com
        driver.get("https://practice.cydeo.com/");
        driver.manage().window().maximize();

        //3.verify URL contains = "cydeo"
        String expectedInURL = "cydeo";
        String actualInURL = driver.getCurrentUrl();

        if(actualInURL.contains(expectedInURL)){
            System.out.println("URL verification PASSED!!!");
        }else {
            System.out.println("URL verification FAILED!!!");
        }

        //4. Verify title = expected: "Practice"
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Tittle verification is PASSED");
        }else{
            System.out.println("Tittle verification is FAILED!");
        }



        driver.quit();
    }
}
