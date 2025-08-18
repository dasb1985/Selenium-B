package org.example.TestCases;

import org.testng.annotations.Test;
import org.example.PageClasses.LandingPage;
public class BuyItems {

    @Test
    public void addItemsToCartAndBuy(){
        LandingPage landingPage = new LandingPage();
        landingPage.openBrowser();
        landingPage.goToURL("https://automationteststore.com");


    }
}
