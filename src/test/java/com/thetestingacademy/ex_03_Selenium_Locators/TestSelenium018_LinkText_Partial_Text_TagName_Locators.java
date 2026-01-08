package com.thetestingacademy.ex_03_Selenium_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium018_LinkText_Partial_Text_TagName_Locators {


    @Description("Verify vwo Create Account Negative TC")
    @Test
    public void verify_Vwo_Login(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com");


        // Full text Match
    //    WebElement click_freeTrial = driver.findElement(By.linkText("Start a free trial"));
    //    click_freeTrial.click();

        //Partail text match
        WebElement Partailclick_freeTrial = driver.findElement(By.partialLinkText("Start a free trial"));
        Partailclick_freeTrial.click();

        driver.quit();
    }
}
