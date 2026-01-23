package com.thetestingacademy.ex_10_Action_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestSelenium33_ActionClass {
    @Test
    public void actionKey() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.spicejet.com/");

        WebElement from_input = driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]/div/div/input"));
        WebElement to_input = driver.findElement(By.xpath("//input[@value=\"Select Destination\"]"));

        Actions actions = new Actions(driver);
        actions.moveToElement(from_input).click().sendKeys("goa").build().perform();

        actions.moveToElement(to_input).click().sendKeys("del").build().perform();
        /*actions
                .moveToElement(to_input).click().sendKeys("del")
                .moveToElement(to_input).click().sendKeys("goa")
                .build().perform();*/

        driver.quit();
    }
}
