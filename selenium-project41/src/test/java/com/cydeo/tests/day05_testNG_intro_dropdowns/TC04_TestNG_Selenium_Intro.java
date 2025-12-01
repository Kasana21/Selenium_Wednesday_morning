package com.cydeo.tests.day05_testNG_intro_dropdowns;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC04_TestNG_Selenium_Intro {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        //TC #4: Cydeo Title Verification
//1.Open Chrome browser
       driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//2.Go to https://www.cydeo.com // https://www.practice.cydeo.com (!!! THIS ONE FASTER)
       driver.get("https://practice.cydeo.com/");
    }

    @AfterMethod
    public void teaDownMethod(){
        driver.quit();
    }
    @Test
    public void CydeoTitleVerification(){
//3.Verify title:
       String expectedTitle = "Practice";//Cydeo
       String actualTitle = driver.getTitle();
       //   Expected: Cydeo/ Practice
       Assert.assertTrue(expectedTitle.equals(actualTitle));
      // Assert.assertEquals(actualTitle,expectedTitle);

       }

}
