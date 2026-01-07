package com.thetestingacademy.ex_02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class TestSelenium016_MIni_project2_Add_Extension {

    @Test
    public void test_Selenium01() throws Exception {

        ChromeOptions chromeOptions = new ChromeOptions();
       // chromeOptions.addArguments("--window-size=1920,1080");
     //   chromeOptions.addArguments("--incognito");
        File path = new File("src/test/java/com/thetestingacademy/AdBlocker.zip");
        chromeOptions.addExtensions(path);

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.Youtube.com");

        Thread.sleep(15000);
        driver.quit();
    }

}
