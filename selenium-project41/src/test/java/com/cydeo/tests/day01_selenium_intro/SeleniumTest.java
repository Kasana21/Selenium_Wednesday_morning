package com.cydeo.tests.day01_selenium_intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        // !!!! in new selenium  <version>4.36.0</version> webdriverManager no need to install dependencies for webdriverManager because of that issue and its already build in into the selenium fixed versions
        //1. creating the instance of chrome browser driver

        WebDriver driver = new ChromeDriver();

        //2.test if driver and browser are working as expected
        driver.get("https://www.google.com/");

        driver.quit();
    }
}
