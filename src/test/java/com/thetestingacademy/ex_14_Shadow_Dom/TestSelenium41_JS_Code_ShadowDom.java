package com.thetestingacademy.ex_14_Shadow_Dom;

import com.thetestingacademy.ex_07_Wait_Helper.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium41_JS_Code_ShadowDom {


    @Test
    public void verifyShadowDom(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
        driver.manage().window().maximize();

        WaitHelpers.waitJVM(3000);

    //    driver.findElement(By.id("pizza")).sendKeys("farmhouse");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement pizzaElement = (WebElement) js.executeScript("return document.querySelector('div#userName').shadowRoot.querySelector('div#app2').shadowRoot.querySelector('input#pizza')");
        pizzaElement.sendKeys("farmHouse");

        WaitHelpers.waitJVM(3000);
        driver.switchTo().frame("pact3");

        WebElement idglaf = driver.findElement(By.id("glaf"));
        idglaf.sendKeys("keys");
    }
}
