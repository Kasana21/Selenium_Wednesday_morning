package com.cydeo.tests.day06_alerts_iframes_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T4_Iframes {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        // TC #4: Iframe practice
//1. Create a new class called: T4_Iframes
//2. Create new test and make set ups
//3. Go to: https://practice.cydeo.com/iframe
        WebDriver driver =  new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://practice.cydeo.com/iframe");
    }
    @AfterMethod

    public void tearDownMethod (){
        driver.quit();
    }
    @Test
    public  void  iFrameTest (){
        WebElement paragraphText = driver.findElement(By.xpath("//p[.='Your content goes here.']"));


//4. Assert: “Your content goes here.” Text is displayed.
//5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
    }

}
