package com.thetestingacademy.ex_15_Relative_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.*;


public class TestSelenium42_RL_P1 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();


        WebElement span_element = driver.findElement(By.xpath("//span[contains(text(),'Years')]"));

        driver.findElement(with(By.id("exp-2")).toRightOf(span_element)).click();

        driver.quit();
    }
}
