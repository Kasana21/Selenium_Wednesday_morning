package com.cydeo.tests.week01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TittleAndUrlCheck {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        //1. OS - mac, browse - chrome
        //creating our driver object for automation
        WebDriver driver = new ChromeDriver();// this part opens the browser
        //maximize the page
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");
        String expectedText = "facebook";
        String actualUrl = driver.getCurrentUrl();

        /*if (actualUrl.contains(expectedText)) {
            System.out.println("PASSED");//passed
        } else {
            System.out.println("FAILLED");
        }*/
        if (!actualUrl.contains(expectedText)){
            System.err.println("FAILED on URL verification");
            System.exit(-1);
        }

       // driver.close();

        //verify title contains Facebook

       /* if(driver.getTitle().contains("Facebook")){
            System.out.println("tittle verification passed");
        }*/

        if (!driver.getTitle().contains("Facebook")){
            System.err.println("FAILED on Title verification");
            System.exit(-1);
        }
        //navigate to https://www.google.com
            driver.navigate().to("https://www.google.com");

        //verify url contains google
       /* if (driver.getCurrentUrl().contains("google")){
            System.out.println();
        }*/
        if (!driver.getCurrentUrl().contains("google")){
            System.err.println("FAILED on URL verification of Google");
            System.exit(-1);
        }

        driver .navigate().back();//goes back to facebook
        if(!driver.getTitle().contains("Facebook")) {
            System.err.println("failed on url verification of google");
            System.exit(-1);
        }

        driver.navigate().forward();//go to google again
       if(!driver.getCurrentUrl().contains("google")) {
           System.err.println("failed on url verification of google");
           System.exit(-1);
       }

        System.out.println();

    }
}
