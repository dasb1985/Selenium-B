package Scenario2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class HandleMouseOver{

    WebDriver driver = null;


    @Test
    public void performOverMouse() throws InterruptedException {
        Assert.assertEquals(driver.getTitle(),"American Golf");
        Thread.sleep(5000);

        //List<WebElement> menu=driver.findElements(By.xpath("/html/body/div[2]/div[1]/div/div[1]/div/div/div[2]/header/div[3]"));
        //int counter=0;
        //for(WebElement element:menu){
        //    System.out.println("Link number: " + counter + " Menu Title: " + element.getText());
        //    counter++;
        //}

        WebElement megaDeals = driver.findElement(By.xpath("//*[@id=\"header-container\"]/div[2]/header/div[3]/ul/div[6]/li/a"));
        //WebDriverWait newArrivals = menu.get(2);

        Actions action  = new Actions(driver);
        action.moveToElement(megaDeals).build().perform();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"header-container\"]/div[2]/header/div[3]/ul/div[6]/div/div/div/div[1]/div[3]/ul/li[2]/a")).click();
        Assert.assertEquals(driver.getTitle(),"Shop American Golf");

    }





    @BeforeMethod
    public void init() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Workspace\\java\\PractiqueJavaSel\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        //driver.get("https://edition.cnn.com");
        //driver.get("https://jqueryui.com");
        driver.get("https://www.americangolf.eu");
        //driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
    }

    @AfterMethod
    public void finish(){
        driver.quit();
    }


}
