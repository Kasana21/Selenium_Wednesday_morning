package com.cydeo.tests.day06_alerts_iframes_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Dropdowns_T6_T7_T8 {
    WebDriver driver = new ChromeDriver();

    @BeforeMethod
    public void setUpMethod(){
        //  1. Open Chrome browser

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //   2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");
        //  3. Select “December 1st, 1933” and verify it is selected.
    }

    @AfterMethod
    public void teardownMethod(){
        driver.quit();
    }

    @Test
    public void dropdowns_task6() throws InterruptedException {
        // TC #6: Selecting date on dropdown and verifying
        Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select dayDropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));
        //    Select year using : visible text
        Thread.sleep(2000);
        yearDropdown.selectByVisibleText("1933");
        //  Select month using : value attribute
        Thread.sleep(2000);
        monthDropdown.selectByValue("11");
        // Select day using : index number
        Thread.sleep(2000);
        dayDropdown.selectByIndex(0);

        String expectedYear ="1933";
        String expectedMonth = "December";
        String expectedDay = "1";

        String actualYear  = yearDropdown.getFirstSelectedOption().getText();
        String actualMonth  = monthDropdown.getFirstSelectedOption().getText();
        String actualDay = dayDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualYear, expectedYear);
        Assert.assertTrue(actualMonth.equals(expectedMonth));
        Assert.assertTrue(actualDay.equals(expectedDay));
        driver.quit();

    }
    @Test
    public void dropdownsTask07() throws InterruptedException {
        //  TC #7: Selecting state from State dropdown and verifying result

        Select stateSelect = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        Thread.sleep(2000);
        stateSelect.selectByVisibleText("Illinois");

        Thread.sleep(2000);
        stateSelect.selectByValue("VA");

        Thread.sleep(2000);
        stateSelect.selectByIndex(5);

        String expectedState = "California";

        String actualState = stateSelect.getFirstSelectedOption().getText();

        // 6. Verify final selected option is California.
        Assert.assertEquals(actualState, expectedState, "STATE DROPDOWN VALUE IS NOT AS EXPECTED!");
        // Use all Select options. (visible text, value, index)
        driver.quit();

    }
    @Test
    public void dropdownTask08() throws InterruptedException {
        //TC #8: Selecting value from non-select dropdown

        //3. Click to non-select dropdown
        //locate the non-select dropdown
        WebElement websiteDropdown = driver.findElement(By.linkText("Dropdown link"));
        //Thread.sleep(1000);
        websiteDropdown.click();
        //Thread.sleep(1000);

        //4. Select Facebook from dropdown
        WebElement facebookLink = driver.findElement(By.linkText("Facebook"));
        //Thread.sleep(1000);
        facebookLink.click();

        //5. Verify title is  "Facebook - log in or sign up"
        String expectedTitle = "Facebook - log in or sign up";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle, "Titles are not equal!");


    }
}
