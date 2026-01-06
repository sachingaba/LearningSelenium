package com.thetestingacademy.ex_02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestSelenium009_AssertJ_TestNG {

   @Description("Open the URL")
    @Test
    void test1() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://intercellworld.com/");

        driver.manage().window().maximize();

        //  driver.manage().window().minimize();

        Thread.sleep(5000);
        //TestNG
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.intercellworld.com/");
        Assert.assertEquals(driver.getTitle(),"Intercell | Career Mentorship | Career Guidance| Home |");


        //AssertJ
       assertThat(driver.getCurrentUrl()).isNotBlank().isNotNull().isEqualTo("https://www.intercellworld.com/");

       driver.quit();
    }
}
