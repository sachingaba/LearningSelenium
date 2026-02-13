package com.thetestingacademy;

import io.qameta.allure.Attachment;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommonToALL {

    public void openBrowser(WebDriver driver, String url){
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
                driver.manage().window().maximize();
        customWait(2000);

    }
    public void closeBrowser(WebDriver driver){

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
    public void customWait(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void waitForVisibility(WebDriver driver, int timeinSeconds, String Xpath){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeinSeconds));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Xpath)));


    }
    @Attachment(value = "Profile screenshot", type = "image/png")
    public byte[] takeScreenshot(WebDriver driver) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}
