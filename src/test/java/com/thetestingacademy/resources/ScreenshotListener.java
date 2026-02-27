package com.thetestingacademy.resources;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Formatter;

import static java.sql.DriverManager.getDriver;

public class ScreenshotListener implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result) {
        LocalDateTime now = LocalDateTime.now();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh_mm_dd_yyyy");
String methodname = result.getName();
        simpleDateFormat.format(now);


        String path = System.getProperty("user.dir")+"FailedScreenshots/"+methodname+simpleDateFormat+".png";
WebDriver driver = new ChromeDriver();
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(file,new File(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
