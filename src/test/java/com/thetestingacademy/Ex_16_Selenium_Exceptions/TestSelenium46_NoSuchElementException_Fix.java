package com.thetestingacademy.Ex_16_Selenium_Exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.sql.SQLOutput;
import java.util.NoSuchElementException;

public class TestSelenium46_NoSuchElementException_Fix {
    WebDriver driver;
    @Test
    public void testSeleniumExceptions() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");

        // driver.manage().window().maximize();

        try {
            WebElement dd = driver.findElement(By.id("kk"));
            dd.sendKeys("kk");
        } catch (NoSuchElementException e) {
            System.out.println("Element Not Found");
        }

    }

    @Test
    public void testTryCatchNoSuchElement() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com");

        System.out.println("🔍 BEFORE TRY");

        try {
            driver.findElement(By.id("sachin"));  // Non-existent element
            System.out.println("❌ This WON'T print");
            Assert.fail("Should not reach here");
        } catch (NoSuchElementException e) {
            System.out.println("✅ TRY-CATCH WORKS! Caught: " + e.getMessage());
            // Test continues here
        }

        System.out.println("🏁 AFTER TRY-CATCH - Test passes!");

        // Verify with Assert (alternative approach)
        Assert.assertEquals(driver.findElements(By.id("sachin")).size(), 0,
                "Element 'sachin' should NOT exist");
    }


    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
