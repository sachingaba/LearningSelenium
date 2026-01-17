package com.thetestingacademy.ex_06_Inputs_Select_Alert_Radio;

import com.thetestingacademy.CommonToALL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium26_Inputs_CheckBox_Radio extends CommonToALL {


    @Test
    public void test_Html_Tags(){
        WebDriver driver = new ChromeDriver();
openBrowser(driver,"https://awesomeqa.com/practice.html");

        WebElement input_Fname = driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
        input_Fname.sendKeys("Sachin");


        WebElement input_Lname = driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
        input_Lname.sendKeys("Gaba");

        WebElement radio_Gender = driver.findElement(By.xpath(" //input[@id=\"sex-0\"]"));
        radio_Gender.click();

        customWait(5000);

        WebElement checkbox_Gender = driver.findElement(By.xpath("//input[@id=\"profession-0\"]"));
        checkbox_Gender.click();

        customWait(5000);

        driver.quit();


    }
}
