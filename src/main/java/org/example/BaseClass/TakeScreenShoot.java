package org.example.BaseClass;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TakeScreenShoot {
    WebDriver driver;
    public void takeScreenshoot() throws IOException {
        String filepath =System.getProperty("user.dir") + "//ss//" + generateFileName();

        File screenshotFile =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile,new File(filepath));

    }

    //Generate ss name
    public String generateFileName(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
        String date = dateFormat.format(new Date());

        String fileName = date +".png";

        return fileName;
    }
}
