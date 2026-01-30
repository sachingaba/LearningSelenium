package com.thetestingacademy.ex_17_Data_Driven_Testing_POI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium51_POI_Excel {


        @Test(dataProvider = "getData")
        public void verifyInvalidCredentials(String username, String password) {
            WebDriver driver = new ChromeDriver();
            driver.get("https://test.intercellworld.com/");

            WebElement user = driver.findElement(By.xpath("//input[@placeholder=\"Please Enter Email ID\"]"));
            WebElement pass = driver.findElement(By.xpath("//input[@placeholder=\"Please Enter Password\"]"));

            user.sendKeys(username);
            pass.sendKeys(password);
            System.out.println("Multiple times I have to Check");
            System.out.println(username + " " + password);
            System.out.println();

            WebElement btn = driver.findElement(By.id("confim_login"));
            btn.click();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()=\"Sorry! Username and Password not matching\"]")));
            WebElement error_msg = driver.findElement(By.xpath("//div[text()=\"Sorry! Username and Password not matching\"]"));
            Assert.assertEquals(error_msg.getText(), "Sorry! Username and Password not matching");
            driver.quit();
        }

        @DataProvider
        public Object[][] getData() {

            return UtilExcel.getTestDataFromExcel("Sheet1");
        }


    }
