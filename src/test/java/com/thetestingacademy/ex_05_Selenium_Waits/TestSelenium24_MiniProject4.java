package com.thetestingacademy.ex_05_Selenium_Waits;

import com.thetestingacademy.CommonToALL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium24_MiniProject4 extends CommonToALL {

    @Test
    public void closeModal(){

        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://www.makemytrip.com/");

        System.out.println(driver.getTitle());

        waitForVisibility(driver,5,"//span[@class=\"commonModal__close\"]");

        WebElement closeMod = driver.findElement(By.className("commonModal__close"));
        closeMod.click();

        closeBrowser(driver);





    }
}
