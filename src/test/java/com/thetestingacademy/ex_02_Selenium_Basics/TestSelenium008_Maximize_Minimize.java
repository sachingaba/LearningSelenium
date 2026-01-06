package com.thetestingacademy.ex_02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium008_Maximize_Minimize {


    @Test
    void test1() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://sdet.live");

        driver.manage().window().maximize();

      //  driver.manage().window().minimize();

        Thread.sleep(5000);
        Assert.assertEquals(driver.getTitle(),"Learn Software Testing &amp; Test Automation");
        driver.quit();
    }
    @Test
    void test2() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://intercellworld.com");

        driver.manage().window().maximize();

        //  driver.manage().window().minimize();

        Thread.sleep(5000);
        Assert.assertEquals(driver.getTitle(),"Intercell | Career Mentorship | Career Guidance| Home |");
        driver.quit();
    }
}
