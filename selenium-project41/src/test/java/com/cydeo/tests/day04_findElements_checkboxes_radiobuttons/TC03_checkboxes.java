package com.cydeo.tests.day04_findElements_checkboxes_radiobuttons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TC03_checkboxes {
    public static void main(String[] args) {
       // TC#3: Checkboxes
       // 1. Go to https://practice.cydeo.com/checkboxes
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://practice.cydeo.com/checkboxes");

        //locate checkBox1 and checkbox2
        WebElement checkBoxOne = driver.findElement(By.xpath("//input[@name='checkbox1']"));

        WebElement checkBoxTwo = driver.findElement(By.xpath("//input[@id='box2']"));

        //  2. Confirm checkbox #1 is NOT selected by default
       System.out.println("checkBoxOne.isSelected(), expecting false = " + checkBoxOne.isSelected());


        //   3. Confirm checkbox #2 is SELECTED by default.

        System.out.println("checkBoxTwo.isSelected(),expecting true = " + checkBoxTwo.isSelected());

        //   4. Click checkbox #1 to select it.
        checkBoxOne.click();
     //   5. Click checkbox #2 to deselect it.
        checkBoxTwo.click();
     //   6. Confirm checkbox #1 is SELECTED.
        System.out.println("checkBoxOne.isSelected(), expecting true = " + checkBoxOne.isSelected());

        //   7. Confirm checkbox #2 is NOT selected.
        System.out.println("checkBoxTwo.isSelected(),expecting false = " + checkBoxTwo.isSelected());

        driver.quit();
    }

}
