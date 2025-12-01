package com.cydeo.tests.day05_testNG_intro_dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TC02_radio_buttons {
    public static void main(String[] args) throws InterruptedException {
      //  XPATH PRACTICES
        //TC #2: Radiobutton handling
       // 1. Open Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       // 2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");
     //   3. Click to “Hockey” radio button
        WebElement hockeyButton = driver.findElement(By.xpath("//input[@id='hockey']"));
        hockeyButton.click();
        Thread.sleep(3000);
       // 4. Verify “Hockey” radio button is selected after clicking.

        if (hockeyButton.isSelected()){
            System.out.println("Verification PASSED");
        }else{
            System.out.println("Verification FAILED");
        }
        driver.quit();
        //  USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS


    }
}
