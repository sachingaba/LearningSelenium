package com.thetestingacademy.resources;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TakeScreenshot {

    public static void TakeScr(WebDriver driver) throws IOException {
        //WebDriver driver = new ChromeDriver();


        LocalDateTime time = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddmmyyyy_hh_mm");
        String formattedTime = time.format(formatter);

        String path = System.getProperty("user.dir")+ "/src/test/java/com/thetestingacademy/resources/Screenshots/test"+formattedTime+".png";

        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(file,new File(path));
    }
}
