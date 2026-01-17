package com.thetestingacademy.ex_06_Inputs_Select_Alert_Radio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestSelenium27_Select_Static {

    @Test
    public void test_select(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();

        WebElement element_select  = driver.findElement(By.id("dropdown"));
        Select select = new Select(element_select);
        //by Index
       // select.selectByIndex(2);

        // by Visible text
         select.selectByVisibleText("Option 2");

        // by value in inspect
       // select.selectByValue("2");




        driver.quit();

    }
}
