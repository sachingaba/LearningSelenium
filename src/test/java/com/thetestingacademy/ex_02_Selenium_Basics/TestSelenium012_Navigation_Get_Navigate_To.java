package com.thetestingacademy.ex_02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium012_Navigation_Get_Navigate_To {

    @Description("Tc#1 - Open the URL")
@Test
    public void test_Selenium(){
    WebDriver driver = new ChromeDriver();
    driver.get("https://katalon-demo-cura.herokuapp.com/");

    driver.navigate().to("https://bing.com/");
    driver.navigate().back();
    driver.navigate().refresh();
    driver.navigate().forward();

driver.quit();
}

}
