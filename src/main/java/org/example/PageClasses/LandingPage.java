package org.example.PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class LandingPage {

    WebDriver driver = null;


    //@BeforeMethod
    public void openBrowser() {
       System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
       driver = new ChromeDriver();
       driver.manage().window().maximize();
    }

    public void goToURL(String url) {
        driver.get(url);
    }

    @AfterMethod
    public void finish() {
        driver.quit();
    }
}
