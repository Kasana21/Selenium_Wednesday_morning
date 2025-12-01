package com.cydeo.tests.day05_testNG_intro_dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TC01_StaleElementReference {
    public static void main(String[] args) throws InterruptedException {
       // XPATH PRACTICES
       // TC #1: StaleElementReferenceException handling
       // 1. Open Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      //  2. Go to https://practice.cydeo.com/add_remove_elements/
        driver.get("https://practice.cydeo.com/add_remove_elements/");

      //  3. Click to “Add Element”
        WebElement addElementButton = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        addElementButton.click();// //button[.='Add Element']

       // 4. Verify “Delete” button is displayed after clicking.
        WebElement deleteButton = driver.findElement(By.xpath("//div[@id='elements']/button"));////button[.='Delete']
        System.out.println("deleteButton.isDisplayed() = expecting true = " + deleteButton.isDisplayed());
        //  5. Click to “Delete” button.
        Thread.sleep(2000);
        deleteButton.click();
       // 6. Verify “Delete” button is NOT displayed after clicking.
        //use try/catch to handle a verify
        try {
            System.out.println("deleteButton.isDisplayed(), expecting false = " + deleteButton.isDisplayed());
        }catch(StaleElementReferenceException e){
            System.out.println("-->StaleElementReferenceException happened due to element being deleted from the page.");
            System.out.println("Which concludes our test case -PASSING!-");
            System.out.println("deleteButton.isDisplayed() = false ");
        }
        //  USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
        driver.quit();


    }
}
