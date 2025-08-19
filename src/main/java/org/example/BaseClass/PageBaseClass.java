package org.example.BaseClass;

import org.example.PageClasses.LandingPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PageBaseClass {

    public WebDriver driver;

//    public PageBaseClass(WebDriver driver) {
//        this.driver = driver;
//    }

    public void invokeBrowser(String browserName) {
        try {
            if (browserName.equalsIgnoreCase("Chrome")) {
                System.setProperty("webdriver.chrome.driver",
                        System.getProperty("user.dir") + "/drivers/chromedriver.exe");
                driver = new ChromeDriver();
            } else if (browserName.equalsIgnoreCase("Mozila")) {
                System.setProperty("webdriver.gecko.driver",
                        System.getProperty("user.dir") + "/drivers/gekcodriver.exe");
                driver = new FirefoxDriver();
            }
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
        driver.manage().window().maximize();
//        return PageFactory.initElements(driver, LandingPage.class);
    }


    public LandingPage goToWebSite(String url) {
        driver.get(url);
        return PageFactory.initElements(driver,LandingPage.class);
    }



    public void titlePageShouldBe(String title) {
        Assert.assertEquals(driver.getTitle(), title);
    }


    //*[contains(@data-id,50)]
}
