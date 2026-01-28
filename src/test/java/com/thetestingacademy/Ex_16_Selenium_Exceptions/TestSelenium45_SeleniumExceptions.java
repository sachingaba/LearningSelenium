package com.thetestingacademy.Ex_16_Selenium_Exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium45_SeleniumExceptions {

    @Test
    void test1() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://sdet.live");

        driver.manage().window().maximize();

        driver.findElement(By.id("Sachin"));

    }
}
