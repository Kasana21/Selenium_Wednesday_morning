package com.cydeo.tests.day02_locators_getText_getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2_LinkTextPractice {
    public static void main(String[] args) {
       // 1.Open Chrome Browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       // 2. Go to: http://practice.cydeo.com
        driver.get("http://practice.cydeo.com");
       // 3. Click to A/B Testing from top of the list
       // driver.findElement(By.linkText("A/B Testing")).click();
        WebElement abTestLink =  driver.findElement(By.linkText("A/B Testing"));abTestLink.click();

       // 4. Verify title is:
       // Expected: No A/B Test
        String expectedTitle = "No A/B Test";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)){
            System.out.println("No A/B tittle PASSED!");
        }else {
            System.out.println("No A/B title FAILED!");
        }

       // 5. Go back to home page by using the .back();
        driver.navigate().back();
       // 6.Verify title equals:
       // Expected: Practice
       expectedTitle = "Practice";
       actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Practice title PASSED");
        }else {
            System.out.println("Practice title FAILED");
        }

        driver.quit();

    }
}
