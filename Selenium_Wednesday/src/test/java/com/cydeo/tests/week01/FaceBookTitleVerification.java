package com.cydeo.tests.week01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookTitleVerification {
    public static void main(String[] args) {
//TC #1: Facebook title verification
//1. Open Chrome browser
//2. Go to https://www.facebook.com
//3. Verify title:
//Expected: “Facebook – log in or sign up”

        WebDriverManager.chromedriver().setup();
        //1. OS - mac, browse - chrome
        //creating our driver object for automation
        WebDriver driver = new ChromeDriver();// this part opens the browser
        //maximize the page
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");
        //verify title: getTitle() method from selenium library
        String expectedTitle = driver.getTitle();
        String actualTitle = driver.getTitle();

        if (expectedTitle.equalsIgnoreCase(actualTitle)){
            System.out.println("title verification PASSED");
        }else{
            System.out.println("title verification FAILED");
        }

        driver.close();
    }
}
