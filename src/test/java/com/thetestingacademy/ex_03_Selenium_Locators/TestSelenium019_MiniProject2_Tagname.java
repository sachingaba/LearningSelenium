package com.thetestingacademy.ex_03_Selenium_Locators;

import com.thetestingacademy.CommonToALL;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium019_MiniProject2_Tagname extends CommonToALL {

    @Description("Verify vwo Create Account Negative TC")
    @Test
    public void verify_Vwo_Login_errorMessgeVerify() {
        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://app.vwo.com");

        //Partail text match
        WebElement a_tag_partialMatch = driver.findElement(By.partialLinkText("trial"));
        a_tag_partialMatch.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));
//Email input
        WebElement email_input = driver.findElement(By.id("page-v1-step1-email"));
        email_input.sendKeys("abc");

// Checkbox tick
        WebElement checkbox_Policy = driver.findElement(By.id("page-free-trial-step1-cu-gdpr-consent-checkbox"));
        checkbox_Policy.click();

//Submit Button
        WebElement button_submit = driver.findElement(By.tagName("button"));
        button_submit.click();


//Verify the message
        WebElement error_msg = driver.findElement(By.className("invalid-reason"));
        Assert.assertEquals(error_msg.getText(),"The email address you entered is incorrect.");




     closeBrowser(driver);
    }

    @Description("Verify vwo Create Account Valid Email TC")
    @Test
    public void verify_Vwo_Login_valid_email() {
        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://app.vwo.com");

        //Partail text match
        WebElement a_tag_partialMatch = driver.findElement(By.partialLinkText("trial"));
        a_tag_partialMatch.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));
//Email input
        WebElement email_input = driver.findElement(By.id("page-v1-step1-email"));
        email_input.sendKeys("mentorgreenland@mmens.com");

// Checkbox tick
        WebElement checkbox_Policy = driver.findElement(By.id("page-free-trial-step1-cu-gdpr-consent-checkbox"));
        checkbox_Policy.click();

//Submit Button
        WebElement button_submit = driver.findElement(By.tagName("button"));
        button_submit.click();

//verify next url
        Assert.assertTrue(driver.getCurrentUrl().contains("mof_eg_loginpage"));
         Assert.assertEquals(driver.getTitle(),("Get Started with Free Trial | VWO"));

         WebElement form_Page = driver.findElement(By.id("ft-page-form"));
        System.out.println(form_Page.getText());
        Assert.assertEquals(form_Page.getText(),"Sign up for a full-featured trial");
                 //"Set up your password to get started"));

        closeBrowser(driver);
    }
}