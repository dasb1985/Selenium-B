package org.example.BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static jdk.tools.jlink.internal.plugins.PluginsResourceBundle.getMessage;

public class PageBaseClass {

    public WebDriver driver;

    public void invokeBrowser(String browserName) {

        try {
            if (browserName.equalsIgnoreCase("Chrome")) {
                System.setProperty("webdriver.chrome.driver",
                        System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver");
                driver = new ChromeDriver();
            } else if (browserName.equalsIgnoreCase("Mozila")) {
                System.setProperty("webdriver.gecko.driver",
                        System.getProperty("user.dir") + "/src/test/resources/drivers/geckodriver");
                driver = new FirefoxDriver();
            }

        } catch (Exception e) {
            System.out.print(getMessage());
        }

    }

    private boolean getMessage() {
        return false;
    }
}
