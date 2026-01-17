package com.thetestingacademy.ex_05_Selenium_Waits;

import com.thetestingacademy.CommonToALL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium22_Waits extends CommonToALL {


    @Test
    public void verifyWait(){
        WebDriver driver = new ChromeDriver();


        driver.get("https://app.vwo.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        closeBrowser(driver);



    }



}
