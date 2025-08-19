package org.example.PageClasses;

import org.example.BaseClass.PageBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;


public class LandingPage extends PageBaseClass{

    WebDriver driver;
    //create COnstructor for the driver to use
    public LandingPage(WebDriver driver) {

        this.driver = driver;
    }

    public void addItemToCart() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"block_frame_featured_1769\"]/div/div[1]/div[2]/div[3]/a")).click();
        Thread.sleep(5000);
    }

    public CartPage goToCart() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div/header/div[2]/div/div[3]/ul/li/a")).click();
        Thread.sleep(5000);
        return PageFactory.initElements(driver,CartPage.class);
    }


    @AfterMethod
    public void finish() {
        driver.quit();
    }
}
