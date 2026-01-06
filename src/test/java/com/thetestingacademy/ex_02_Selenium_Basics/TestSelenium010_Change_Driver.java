package com.thetestingacademy.ex_02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class TestSelenium010_Change_Driver {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver = new EdgeDriver();
        driver.get("https://www.intercellworld.com/");
    }
}
