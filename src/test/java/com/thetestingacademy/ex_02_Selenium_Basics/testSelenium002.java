package com.thetestingacademy.ex_02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testSelenium002 {


    @Test
    public void testBrowser(){
        FirefoxDriver f1 = new FirefoxDriver();
        f1.get("http://www.youtube.com");


    }

    @Test
    public void testBrowser1(){
        ChromeOptions options = new ChromeOptions();
        options.setBinary("\"C:\\Users\\devin\\Downloads\\comet_installer_latest.exe\"");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com");

    }
}
