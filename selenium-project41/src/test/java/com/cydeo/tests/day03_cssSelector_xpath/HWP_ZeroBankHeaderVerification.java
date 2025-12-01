package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HWP_ZeroBankHeaderVerification {
    public static void main(String[] args) {
        //Gurkhan
        //HWP #2: Zero Bank header verification
        //1. Open Chrome browser
        //2. Go to http://zero.webappsecurity.com/login.html
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com/login.html ");


        //3. Verify header text
        //solution with xpath locator
        //WebElement headerText = driver.findElement(By.xpath("//h3"));

        //solution with cssSelector locator
        // --- > tag[attribute='value']
        WebElement headerText = driver.findElement(By.cssSelector("h3"));

        //Expected: “Log in to ZeroBank”
        String expectedHeader = "Log in to ZeroBank";
        String actualHeader = headerText.getText();

        if(actualHeader.equals(expectedHeader)){
            System.out.println("Header text value PASSED!");
        }else{
            System.out.println("Header text value FAILED!!!");

        }


       /* //Oksana
        //HWP #2: Zero Bank header verification

       // 1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        //3. Verify header text
       // Expected: “Log in to ZeroBank”
        String expectedHeaderText = "Log in to ZeroBank";
        WebElement headerText = driver.findElement(By.xpath("//*[.='Log in to ZeroBank']"));

        String actualHeaderText = headerText.getText();

        if (actualHeaderText.equals(expectedHeaderText)){
            System.out.println("Header verification PASSED");
        }else {
            System.out.println("Header verification FAILED");
            System.out.println(actualHeaderText);
        }

        driver.quit();
         */


    }
}
