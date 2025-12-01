package com.cydeo.tests.review;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class TestCase01 {
    /*
      // 1. Open a chrome browser
      // 2. Go to: https://practice.expandtesting.com/
      // 3. Verify url contains "expandtesting"
      // 4. Go to https://practice.expandtesting.com/login
      // 5. Verify url contains "login"
      // 6. Navigate back, forward and refresh
      // 7. Verify title is "Test Login Page for Automation Testing Practice"
     */
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get(" https://practice.expandtesting.com/");
    }
}
