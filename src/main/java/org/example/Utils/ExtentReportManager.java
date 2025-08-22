package org.example.Utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.StatusFilter;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;


public class ExtentReportManager {
    public static ExtentReports extentReports = new ExtentReports();
    static ExtentTest reporterTest;

    public static void generateReportFile() throws IOException {

        ExtentSparkReporter spark = new ExtentSparkReporter("first_report");

        spark.loadXMLConfig(System.getProperty("user.dir") + "/properties/reportConfig.xml");
        extentReports.attachReporter(spark);

        ExtentTest shopTestReport = extentReports.createTest("Shopping Cart");


//        ExtentReports failedDspark = new ExtentReports();
//        failedDspark.loadXMLConfig(System.getProperty("user.dir") + "/properties/reportConfig.xml");
//        extentReports.attachReporter(failedDspark);
//        ExtentSparkReporter failedDspark = new ExtentSparkReporter("failed_report")
//                .filter().statusFilter()
//                .as(new StatusFilter[]{
//                    Status.FAIL}).apply();


    }

    public static void flushReport() throws IOException {
        extentReports.flush();
    }
}


