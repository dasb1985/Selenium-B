package org.example.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.example.PageClasses.LandingPage;
public class BuyItems {

    WebDriver driver;
    @Test
    public void addItemsToCartAndBuy() throws InterruptedException {
        LandingPage landingPage = new LandingPage(driver);
        landingPage.openBrowser();
        landingPage.goToURL("https://automationteststore.com");
        landingPage.addItemToCart();
        landingPage.goToCart();


    }
}
