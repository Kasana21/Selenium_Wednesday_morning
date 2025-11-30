package com.cydeo.tests.week03;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class VytrackProjectTestBase {
    WebDriver driver;  // attribute of parent class
    // runs before every @Test method
    @BeforeClass
    public void setUp(){ // action of parent class
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        // define implicitly wait: it is enough to declare just once, it will be used by all test methods and lines of code
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://vytrack.com/");
    }

    @AfterClass
    public void tearDown(){
        // usually we define taking screenshot of failure
        driver.close();
    }

}