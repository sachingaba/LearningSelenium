package com.thetestingacademy.ex_04_Selenium_XPATH;

import com.thetestingacademy.CommonToALL;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium20_MiniProject_sachin extends CommonToALL {

    @Severity(SeverityLevel.CRITICAL)
    @Owner("Sachin Gaba")
    @Description("Verify login is working")
    @Test
    public void test_OHRM_login() throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://awesomeqa.com/hr/web/index.php/auth/login");

        customWait(5000);
       // WebElement input_username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
        WebElement input_username = driver.findElement(By.xpath("//input[@name=\"username\"]"));

        input_username.sendKeys("admin");

        WebElement pass_input = driver.findElement(By.xpath("//input[@name=\"password\"]"));
        pass_input.sendKeys("Hacker@4321");

        WebElement submit_button = driver.findElement(By.xpath("//button"));
        submit_button.click();

        customWait(3000);

        WebElement h6 = driver.findElement(By.xpath("//span[@class=\"oxd-topbar-header-breadcrumb\"]/h6"));
        Assert.assertEquals(h6.getText(),"PIM");
        closeBrowser(driver);
    }
}
