package com.cydeo.tests.day02_locators_getText_getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3_PartialLinkText_GoogleSearch {
    public static void main(String[] args) throws InterruptedException {
        //1. Open a chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2. Go to: https://google.com
        driver.get("https://google.com");
        //3. Write "apple" in search box
        //3.1 locate search box
        WebElement googleSearchBox = driver.findElement(By.name("q"));
        //3.2enter "apple" key, and press key
        googleSearchBox.sendKeys("apple"+ Keys.ENTER);

        //4. Press Enter to search(basicaly imitating user enter to sent keys)
        //Thread.sleep(2000);
        //googleSearchBox.sendKeys(Keys.ENTER);

        //5. Verify title:
        //     Expected: Tittle should start with "apple" word
        String expectedInBeginningOfTitle = "apple";
        String actualTitle = driver.getTitle();



        if(actualTitle.startsWith(expectedInBeginningOfTitle)){
            System.out.println("Title verification PASSED");
        }else {
            System.out.println("Title verification FAILED");
        }




    }
}
