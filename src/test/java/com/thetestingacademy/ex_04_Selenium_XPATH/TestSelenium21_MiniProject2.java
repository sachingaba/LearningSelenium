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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium21_MiniProject2 extends CommonToALL {

    private static final Logger log = LoggerFactory.getLogger(TestSelenium21_MiniProject2.class);

    @Severity(SeverityLevel.CRITICAL)
    @Owner("Sachin Gaba")
    @Description("Verify login is working")
    @Test
    public void test_OHRM_login() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        openBrowser(driver, "https://katalon-demo-cura.herokuapp.com/");

        WebElement make_App = driver.findElement(By.xpath("//a[contains(text(),\"Make Appointment\")]"));
        make_App.click();

        List<WebElement> username_input = driver.findElements(By.xpath("//input[@placeholder=\"Username\"]"));
        username_input.get(1).sendKeys("John Doe");

        List<WebElement> pass_input = driver.findElements(By.xpath("//input[@placeholder=\"Password\"]"));
        pass_input.get(1).sendKeys("ThisIsNotAPassword");

        WebElement login_btn = driver.findElement(By.xpath("//button[text()=\"Login\"]"));
        login_btn.click();

        customWait(3000);

        WebElement verify_h2 = driver.findElement(By.xpath("//h2[text()=\"Make Appointment\"]"));
        Assert.assertEquals(verify_h2.getText(),"Make Appointment");
        Assert.assertTrue(verify_h2.isDisplayed());

        closeBrowser(driver);
    }
}
