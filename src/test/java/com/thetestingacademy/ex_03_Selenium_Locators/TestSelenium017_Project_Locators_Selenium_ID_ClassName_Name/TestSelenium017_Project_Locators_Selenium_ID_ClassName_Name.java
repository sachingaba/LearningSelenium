package com.thetestingacademy.ex_03_Selenium_Locators.TestSelenium017_Project_Locators_Selenium_ID_ClassName_Name;

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

public class TestSelenium017_Project_Locators_Selenium_ID_ClassName_Name extends CommonToALL {


    @Description("TC#1 - Test to verify invalid credentials gives Error message on display")
    @Owner("Sachin Gaba")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void test_vwo_login_Invalid_Login () throws InterruptedException {
//<input class="form-control rounded-0 ng-pristine ng-invalid ng-touched"
//    formcontrolname="email"
//    placeholder="Please Enter Email ID"
//    type="text" ng-reflect-name="email">
        WebDriver driver = new ChromeDriver();
        // we can also use
        //openBrowser(driver,"https://test.intercellworld.com/" );
        driver.manage().window().maximize();
        driver.get("https://test.intercellworld.com/");
        //Email
        WebElement email_Input_Box = driver.findElement(By.xpath("//*[@id=\"myAnchor\"]/div/div[1]/div/div[2]/form/div/div[1]/input"));
        email_Input_Box.sendKeys("iamasjd@ma.com");
        // Password
       WebElement password_Input_Box = driver.findElement(By.xpath("//*[@id=\"show_hide_password\"]/input"));
       password_Input_Box.sendKeys("Intercell@123");
       //Click Sign-In
        WebElement clickSignIn = driver.findElement(By.id("confim_login"));
        clickSignIn.click();



        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //Verify message
        WebElement errorMsg = driver.findElement(By.xpath("//div[contains(@class, 'red-clr') and contains(@class, 'header-box') and text()='Sorry! Username and Password not matching']"));
        System.out.println(errorMsg.getText());

        Assert.assertEquals(errorMsg.getText(),"Sorry! Username and Password not matching");

        closeBrowser(driver);
    }
}
