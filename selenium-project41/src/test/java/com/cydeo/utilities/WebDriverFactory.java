package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

// TASK: NEW METHOD CREATION
// Method name : getDriver
// Static method
// Accepts String arg: browserType
//   - This arg will determine what type of browser is opened
//   - if "chrome" passed --> it will open Chrome browser
//   - if "firefox" passed --> it will open firefox browser
// RETURN TYPE: "WebDriver"
public class WebDriverFactory {

   public static WebDriver getDriver(String browserType) {

       if (browserType.equalsIgnoreCase("chrome")) {

           // WebDriverManager.chromedriver().setup();
           return new ChromeDriver();

       } else if (browserType.equalsIgnoreCase("firefox")) {

           //   WebDriverManager.firefoxdriver().setup();
           return new FirefoxDriver();
       } else if (browserType.equalsIgnoreCase("safari")) {
           return new SafariDriver();


       } else {
           System.err.println("Given string doesn't represent any browser.");
           System.err.println("Either that browser does not exist or not currently supported.");
           System.err.println("driver = null");
           return null;
       }
   }
}
