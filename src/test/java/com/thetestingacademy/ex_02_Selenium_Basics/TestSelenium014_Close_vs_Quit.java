package com.thetestingacademy.ex_02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium014_Close_vs_Quit {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://katalon-demo-cura.herokuapp.com/");
        Thread.sleep(5000);
       driver.close();
        //Session id != null
        //only close the current tab and not kill the broswer

       // driver.quit();
        //Will terminate the session
        //Session id == null
    }
}
