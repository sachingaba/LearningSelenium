package com.thetestingacademy.Ex_16_Selenium_Exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium49_TimeOutException {

    @Test
    void test1() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com");

        driver.manage().window().maximize();


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("Test")));
        WebElement search = driver.findElement(By.id("APjFqb"));

        search.sendKeys("hello all");


        driver.quit();
    }
}
