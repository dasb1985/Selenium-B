package org.example.TestCases;

import org.example.BaseClass.PageBaseClass;
import org.example.PageClasses.CartPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.example.PageClasses.LandingPage;
import org.example.PageClasses.CartPage;
import org.example.BaseClass.PageBaseClass;

public class BuyItems extends PageBaseClass {

    WebDriver driver;
    LandingPage landingPage;
    CartPage cartPage;

    @Test
    public void addItemsToCartAndBuy() throws InterruptedException {
        LandingPage landingPage = new LandingPage(driver);
        landingPage.invokeBrowser("chrome");
        landingPage.goToWebSite("https://automationteststore.com");
        landingPage.addItemToCart();
        cartPage= landingPage.goToCart();
        Thread.sleep(2000);
        cartPage.increaseItemQuantityTo(2);
        cartPage.clickUpdateCart();
        Thread.sleep(2000);

    }
}
