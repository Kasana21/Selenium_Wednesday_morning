package com.cydeo.tests.day06_alerts_iframes_windows;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T1_T2_T3_Alert_Practices {
    WebDriver driver = new ChromeDriver();
    @BeforeMethod
    public void setUpMethod(){
        //1. Open browser
//2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://practice.cydeo.com/javascript_alerts");
    }
    @AfterMethod
    public void tearDownMethod(){
        driver.quit();
    }
    @Test
    public void information_alert_test1() throws InterruptedException {
        //  TC #1: Information alert practice

        //3. Click to “Click for JS Alert” button
        WebElement informationAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        informationAlertButton.click();

        //4. Click to OK button from the alert
        Alert alert = driver.switchTo().alert();

        //Thread.sleep(1000);
        alert.accept();

        //5. Verify “You successfully clicked an alert” text is displayed.
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        //Failure message will only be displayed if assertion fails:
        Assert.assertTrue(resultText.isDisplayed(), "Result text is NOT displayed!");

        String expectedText = "You successfully clicked an alert";
        String actualText = resultText.getText();

        Assert.assertEquals(actualText, expectedText, "Actual result text is NOT as expected!");
    }

    @Test
    public void  conformation_alert_test2() throws InterruptedException {
        //TC #2: Confirmation alert practice

//3. Click to “Click for JS Confirm” button
        WebElement conformationAlert = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
        conformationAlert.click();
//4. Click to OK button from the alert
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();
//5. Verify “You clicked: Ok” text is displayed.
        WebElement alertText = driver.findElement(By.xpath("//p[.='You clicked: Ok']"));
        Assert.assertTrue(alertText.isDisplayed(), "Result text is NOT displayed!");
        String expectedText = "You clicked: Ok";
        String actualText = alertText.getText();

        Assert.assertEquals(actualText, expectedText, "Text result is not as expected");
    }
        @Test
    public  void informationAlertPrompt(){

            // TC #3: Information alert practice

// 3. Click to “Click for JS Prompt” button
            WebElement promptClick = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
           promptClick.click();
//4. Send “hello” text to alert
            Alert alert = driver.switchTo().alert();
            alert.sendKeys("hello");
//5. Click to OK button from the alert
           alert.accept();
//6. Verify “You entered: hello” text is displayed.
            WebElement textResult = driver.findElement(By.xpath("//p[.='You entered: hello']"));
            String expectedText ="You entered: hello";
            String actualText = textResult.getText();
            Assert.assertEquals(expectedText,actualText, "Text not as expected");

        }


}
