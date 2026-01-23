package com.thetestingacademy.ex_10_Action_Classes;

import com.thetestingacademy.ex_07_Wait_Helper.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestSelenium32_ActionClass {

    @Test
    public void actionKey(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://awesomeqa.com/practice.html");

        WebElement input_Fname = driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
        Actions action = new Actions(driver);
        action.keyDown(Keys.SHIFT).sendKeys(input_Fname,"Sachin").keyUp(Keys.SHIFT).build().perform();

        WaitHelpers.waitJVM(2000);
        driver.quit();

    }
}
