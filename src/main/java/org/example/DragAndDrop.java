package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;

import java.time.Duration;

public class DragAndDrop
{
    WebDriver driver = null;

    @Test
    public void dragTest() throws InterruptedException {
        //Documentation for this class
        //https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/interactions/Actions.html

        Assert.assertEquals(driver.getTitle(), "jQuery UI");

        driver.findElement(By.linkText("Draggable")).click();
        //Check correct page
        Assert.assertEquals(driver.getTitle(), "Draggable | jQuery UI");

        //First move to the Iframe
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

        Thread.sleep(3000);
        WebElement dragable = driver.findElement(By.id("draggable"));

        Actions action  = new Actions(driver);
        action.dragAndDropBy(dragable, 200,200).build().perform();

        Thread.sleep(5000);

    }

    @Test
    public void dropTest() throws InterruptedException {
        Assert.assertEquals(driver.getTitle(), "jQuery UI");

        driver.findElement(By.linkText("Droppable")).click();
        //Check correct page
        Assert.assertEquals(driver.getTitle(), "Droppable | jQuery UI");
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

        WebElement dragable= driver.findElement(By.id("draggable"));
        WebElement finalPosition= driver.findElement(By.id("droppable"));

        Actions action = new Actions(driver);
        action.dragAndDrop(dragable, finalPosition).build().perform();
        //action.clickAndHold(dragable).moveToElement(finalPosition).build().perform();

        Thread.sleep(3000);
    }

    @BeforeMethod
    public void init() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        driver.get("https://jqueryui.com/");

    }

    @AfterMethod
    public void finish() {
        driver.quit();
    }
}
