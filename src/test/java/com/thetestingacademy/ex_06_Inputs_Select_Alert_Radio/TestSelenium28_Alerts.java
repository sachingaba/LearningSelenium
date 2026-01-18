package com.thetestingacademy.ex_06_Inputs_Select_Alert_Radio;

import com.thetestingacademy.CommonToALL;
import io.qameta.allure.internal.shadowed.jackson.databind.ser.Serializers;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium28_Alerts extends CommonToALL {


    @Test
    public void test_Alerts(){

        WebDriver driver = new ChromeDriver();

        openBrowser(driver,"https://the-internet.herokuapp.com/javascript_alerts");

        WebElement jsAlert_btn = driver.findElement(By.xpath("//button[@onClick=\"jsAlert()\"]"));

        WebElement jsConfirm_btn = driver.findElement(By.xpath("//button[@onClick=\"jsConfirm()\"]"));

        WebElement jsPrompt_btn = driver.findElement(By.xpath("//button[@onClick=\"jsPrompt()\"]"));

        jsAlert_btn.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        alert.accept();


        WebElement result = driver.findElement(By.id("result"));
        Assert.assertEquals(result.getText(),"You successfully clicked an alert");
closeBrowser(driver);
    }

    @Test
    public void test_Confirm_Ok(){
        WebDriver driver = new ChromeDriver();

        openBrowser(driver,"https://the-internet.herokuapp.com/javascript_alerts");



        WebElement jsConfirm_btn = driver.findElement(By.xpath("//button[@onClick=\"jsConfirm()\"]"));



        jsConfirm_btn.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement result = driver.findElement(By.id("result"));
        Assert.assertEquals(result.getText(),"You clicked: Ok");

        closeBrowser(driver);
    }

    @Test
    public void test_Confirm_Cancel(){
        WebDriver driver = new ChromeDriver();

        openBrowser(driver,"https://the-internet.herokuapp.com/javascript_alerts");



        WebElement jsConfirm_btn = driver.findElement(By.xpath("//button[@onClick=\"jsConfirm()\"]"));



        jsConfirm_btn.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        alert.dismiss();

        WebElement result = driver.findElement(By.id("result"));
        Assert.assertEquals(result.getText(),"You clicked: Cancel");

        closeBrowser(driver);
    }
    @Test
    public void test_Confirm_Prompt_Ok(){
        WebDriver driver = new ChromeDriver();

        openBrowser(driver,"https://the-internet.herokuapp.com/javascript_alerts");



        WebElement jsPrompt_btn = driver.findElement(By.xpath("//button[@onClick=\"jsPrompt()\"]"));



        jsPrompt_btn.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Sachin was Here !!");
        alert.accept();

        WebElement result = driver.findElement(By.id("result"));
        Assert.assertEquals(result.getText(),"You entered: Sachin was Here !!");

        closeBrowser(driver);
    }
    @Test
    public void test_Confirm_Prompt_Cancel(){
        WebDriver driver = new ChromeDriver();

        openBrowser(driver,"https://the-internet.herokuapp.com/javascript_alerts");



        WebElement jsPrompt_btn = driver.findElement(By.xpath("//button[@onClick=\"jsPrompt()\"]"));



        jsPrompt_btn.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Sachin was Here !!");
        alert.dismiss();

        WebElement result = driver.findElement(By.id("result"));
        Assert.assertEquals(result.getText(),"You entered: null");

        closeBrowser(driver);
    }
}
