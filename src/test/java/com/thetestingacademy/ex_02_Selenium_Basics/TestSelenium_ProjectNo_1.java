package com.thetestingacademy.ex_02_Selenium_Basics;

import com.thetestingacademy.CommonToALL;
import io.qameta.allure.Description;
import io.qameta.allure.Link;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium_ProjectNo_1 extends CommonToALL {

    @Description("TC#1 - Verify text exists in url")
    @Link("www.intercellworld.com")
    @Test
    public void testVerifyText(){
        WebDriver driver = new ChromeDriver();

        openBrowser(driver,"https://katalon-demo-cura.herokuapp.com/");
        if(driver.getPageSource().contains("CURA Healthcare Service")){
            System.out.println("Test Case Passed");
            Assert.assertTrue(true);
        }else{
            System.out.println("Test Case Failed");
            Assert.fail();
        }
        closeBrowser(driver);

    }
}
