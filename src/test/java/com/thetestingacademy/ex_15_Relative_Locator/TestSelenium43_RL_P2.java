package com.thetestingacademy.ex_15_Relative_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class TestSelenium43_RL_P2 {
@Test
    public void verifyerror(){
        ChromeOptions options = new ChromeOptions();


        WebDriver driver = new ChromeDriver();
        driver.get("https://codepen.io/AbdullahSajjad/full/LYGVRgK");
        driver.manage().window().maximize();



        driver.switchTo().frame("result");

        WebElement submit_btn = driver.findElement(By.xpath("//button[text()=\"Submit\"]"));
        submit_btn.click();

        WebElement user_element = driver.findElement(By.xpath("//input[@id=\"username\"]"));

        WebElement error_elem = driver.findElement(with(By.tagName("small")).below(user_element));
        Assert.assertEquals(error_elem.getText(),"Username must be at least 3 characters");
    }
}
