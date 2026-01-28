package com.thetestingacademy.Ex_16_Selenium_Exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium47_Stale {
    @Test
    void test1() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com");

        driver.manage().window().maximize();

       WebElement search =  driver.findElement(By.id("APjFqb"));
       driver.navigate().refresh();
        try {
            search.sendKeys("hello all");
        } catch (Exception e) {
            System.out.println("Error!!");
        }

        driver.quit();



    }
}
