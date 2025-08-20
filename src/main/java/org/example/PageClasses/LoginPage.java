package org.example.PageClasses;

import org.example.BaseClass.PageBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBaseClass {
    WebDriver driver;

    public LoginPage() {
        this.driver = driver;
    }


    @FindBy(id = "accountFrm_accountguest")
    WebElement guestBtn;
    public void selectAsGuest(){
        guestBtn.click();
    }

    @FindBy(xpath = "//*[@id=\"accountFrm\"]/fieldset/button" )
    WebElement continueBTN;
    public void clickContinue(){
        continueBTN.click();
    }

}
