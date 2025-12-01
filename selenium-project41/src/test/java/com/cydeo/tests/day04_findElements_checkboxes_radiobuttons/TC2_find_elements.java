package com.cydeo.tests.day04_findElements_checkboxes_radiobuttons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class TC2_find_elements {
    public static void main(String[] args) {
       // TC #2: FindElements Task
       // 1- Open a chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       // 2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");
       // 3- Locate all the links in the page.
        //Oksana
       // WebElement homeLinkxPath = driver.findElement(By.xpath("//a[@class='nav-link']"));//
       // WebElement cydeoLinkxPath = driver.findElement(By.xpath("//a[@href='https://cydeo.com/']"));
        // ??? WebElement homeLinkcssSelector = driver.findElement(By.cssSelector("a[href='Home']"));
        //Gurkhan
        List<WebElement> listOfLinks = driver.findElements(By.tagName("a"));

        // 4- Print out the number of the links on the page.
        //Gurkhan
        System.out.println("listOfLinks.size() = " + listOfLinks.size());

        // 5- Print out the texts of the links.
        //Oksana
       // System.out.println("homeLinkxPath.getText() = " + homeLinkxPath.getText());
        //System.out.println("cydeoLinkxPath.getText() = " + cydeoLinkxPath.getText());
        //Gurkhan in step 6 is combined 5 and 6

       /* for (WebElement each : listOfLinks) {
            //System.out.println(each);//prints out reference object (every time is different numbers)
            System.out.println("Text of links : " + each.getText());//proper way of printing out text of links
        }

        */
        // 6- Print out the HREF attribute values of the links
        //Oksana
       // System.out.println("homeLinkxPath.getAttribute(\"href\") = " + homeLinkxPath.getAttribute("href"));
       // System.out.println("cydeoLinkxPath.getAttribute(\"href\") = " + cydeoLinkxPath.getAttribute("href"));
        //Gurkhan
        for (WebElement each : listOfLinks) {
            System.out.println("Text of links: " + each.getText());
            System.out.println("HREF  attributes values: " + each.getAttribute("href"));

        }

        //Gurkhan

        driver.quit();
    }
}
