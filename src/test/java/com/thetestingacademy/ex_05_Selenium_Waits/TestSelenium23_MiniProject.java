package com.thetestingacademy.ex_05_Selenium_Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium23_MiniProject {


    @Test
    public void verify_login_invalid(){

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--start-maximized");


        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://app.vwo.com");

        System.out.println(driver.getTitle());

        WebElement email_input = driver.findElement(By.xpath("//input[@id=\"login-username\"]"));
        email_input.sendKeys("hello");


        WebElement pass_input = driver.findElement(By.xpath("//input[@id=\"login-password\"]"));
        pass_input.sendKeys("hello");

        WebElement submit_btn = driver.findElement(By.xpath("//button[@data-qa =\"sibequkica\"]"));
        submit_btn.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("js-notification-box")));


        WebElement error_msg = driver.findElement(By.id("js-notification-box"));
        Assert.assertEquals(error_msg.getText(),"Your email, password, IP address or location did not match");
driver.quit();





    }
}
