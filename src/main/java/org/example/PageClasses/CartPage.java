package org.example.PageClasses;

import org.example.BaseClass.PageBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends PageBaseClass {

    WebDriver driver;
    //create COnstructor for the driver to use
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }


    public void increaseItemQuantityTo(int itemNumber) throws InterruptedException {
        driver.findElement(By.id("cart_quantity50")).sendKeys("itemNumber");
    }

    @FindBy(id = "cart_update")
    WebElement cartUpdate;
    public void clickUpdateCart(){
        cartUpdate.click();
    }
}
