package org.example.TestCases;
import org.example.Utils.ExtentReportManager;
import org.example.BaseClass.PageBaseClass;
import org.example.PageClasses.CartPage;
import org.example.Utils.ExtentReportManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.example.PageClasses.LandingPage;

import java.io.IOException;

import static org.example.Utils.ExtentReportManager.extentReports;

public class BuyItems extends PageBaseClass {

    WebDriver driver;
    LandingPage landingPage;
    CartPage cartPage;

    @Test
    public void addItemsToCartAndBuy() throws InterruptedException {

        PageBaseClass pageBaseClass = new PageBaseClass();
        pageBaseClass.invokeBrowser("Chrome");
        landingPage= pageBaseClass.goToWebSite("https://automationteststore.com");
        landingPage.addItemToCart();
        cartPage= landingPage.goToCart();
        Thread.sleep(2000);
        cartPage.increaseItemQuantityTo( "2");
        cartPage.clickUpdateCart();
        Thread.sleep(2000);

    }

    @BeforeMethod
    public void init() throws IOException {
        ExtentReportManager.generateReportFile();
    }
    @AfterMethod
    public void tearDown() throws IOException {
        ExtentReportManager.flushReport();
    }
}
