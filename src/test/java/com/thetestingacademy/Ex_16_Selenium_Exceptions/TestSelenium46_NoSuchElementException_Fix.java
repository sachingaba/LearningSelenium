package com.thetestingacademy.Ex_16_Selenium_Exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.sql.SQLOutput;
import java.util.NoSuchElementException;

public class TestSelenium46_NoSuchElementException_Fix {

    @Test
    public void testSeleniumExceptions() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");

       // driver.manage().window().maximize();

        try {
         WebElement dd =  driver.findElement(By.id("kk"));
        } catch (NoSuchElementException e) {
            System.out.println("Element Not Found");
        }

    }
}
